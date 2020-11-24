package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the RedialRequested event. */
@js.native
trait RedialRequestedEventArgs extends js.Object {
  
  /** Indicates that the RedialRequested event has been handled. */
  def handled(): Unit = js.native
}
object RedialRequestedEventArgs {
  
  @scala.inline
  def apply(handled: () => Unit): RedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[RedialRequestedEventArgs]
  }
  
  @scala.inline
  implicit class RedialRequestedEventArgsOps[Self <: RedialRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHandled(value: () => Unit): Self = this.set("handled", js.Any.fromFunction0(value))
  }
}
