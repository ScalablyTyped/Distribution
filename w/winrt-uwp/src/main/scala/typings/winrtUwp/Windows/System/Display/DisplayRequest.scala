package typings.winrtUwp.Windows.System.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a display request. */
@js.native
trait DisplayRequest extends js.Object {
  
  /** Activates a display request. */
  def requestActive(): Unit = js.native
  
  /** Deactivates a display request. */
  def requestRelease(): Unit = js.native
}
object DisplayRequest {
  
  @scala.inline
  def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
    val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
    __obj.asInstanceOf[DisplayRequest]
  }
  
  @scala.inline
  implicit class DisplayRequestOps[Self <: DisplayRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestActive(value: () => Unit): Self = this.set("requestActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestRelease(value: () => Unit): Self = this.set("requestRelease", js.Any.fromFunction0(value))
  }
}
