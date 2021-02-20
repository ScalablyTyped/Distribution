package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watch[T] extends StObject {
  
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
  implicit class WatchMutableBuilder[Self <: Watch[_], T] (val x: Self with Watch[T]) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProgram(value: () => T): Self = StObject.set(x, "getProgram", js.Any.fromFunction0(value))
  }
}
