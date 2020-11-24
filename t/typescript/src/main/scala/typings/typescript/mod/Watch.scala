package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watch[T] extends js.Object {
  
  /** Closes the watch */
  def close(): Unit = js.native
  
  /** Synchronize with host and get updated program */
  def getProgram(): T = js.native
}
object Watch {
  
  @scala.inline
  def apply[T](close: () => Unit, getProgram: () => T): Watch[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram))
    __obj.asInstanceOf[Watch[T]]
  }
  
  @scala.inline
  implicit class WatchOps[Self <: Watch[_], T] (val x: Self with Watch[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProgram(value: () => T): Self = this.set("getProgram", js.Any.fromFunction0(value))
  }
}
