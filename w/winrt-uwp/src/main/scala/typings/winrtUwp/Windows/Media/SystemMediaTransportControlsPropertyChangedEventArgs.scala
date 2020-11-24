package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Occurs when a property is changed on the SystemMediaTransportControls . */
@js.native
trait SystemMediaTransportControlsPropertyChangedEventArgs extends js.Object {
  
  /** The property that was changed on the SystemMediaTransportControls . */
  var property: SystemMediaTransportControlsProperty = js.native
}
object SystemMediaTransportControlsPropertyChangedEventArgs {
  
  @scala.inline
  def apply(property: SystemMediaTransportControlsProperty): SystemMediaTransportControlsPropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsPropertyChangedEventArgs]
  }
  
  @scala.inline
  implicit class SystemMediaTransportControlsPropertyChangedEventArgsOps[Self <: SystemMediaTransportControlsPropertyChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setProperty(value: SystemMediaTransportControlsProperty): Self = this.set("property", value.asInstanceOf[js.Any])
  }
}
