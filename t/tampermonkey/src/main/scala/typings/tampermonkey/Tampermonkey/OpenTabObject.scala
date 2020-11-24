package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenTabObject extends js.Object {
  
  /** Closes tab */
  def close(): Unit = js.native
  
  var closed: Boolean = js.native
  
  /** Set closed listener */
  var onclosed: js.UndefOr[js.Function0[Unit]] = js.native
}
object OpenTabObject {
  
  @scala.inline
  def apply(close: () => Unit, closed: Boolean): OpenTabObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTabObject]
  }
  
  @scala.inline
  implicit class OpenTabObjectOps[Self <: OpenTabObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclosed(value: () => Unit): Self = this.set("onclosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnclosed: Self = this.set("onclosed", js.undefined)
  }
}
