package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information that indicates why a Producer app was stopped. */
@js.native
trait AllJoynProducerStoppedEventArgs extends js.Object {
  
  /** Returns an AllJoyn status code that indicates why the Producer was stopped. Common values are defined by AllJoynStatus . */
  var status: Double = js.native
}
object AllJoynProducerStoppedEventArgs {
  
  @scala.inline
  def apply(status: Double): AllJoynProducerStoppedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynProducerStoppedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynProducerStoppedEventArgsOps[Self <: AllJoynProducerStoppedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
