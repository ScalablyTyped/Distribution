package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Occurs when a property is changed on the SystemMediaTransportControls . */
trait SystemMediaTransportControlsPropertyChangedEventArgs extends js.Object {
  /** The property that was changed on the SystemMediaTransportControls . */
  var property: SystemMediaTransportControlsProperty
}

object SystemMediaTransportControlsPropertyChangedEventArgs {
  @scala.inline
  def apply(property: SystemMediaTransportControlsProperty): SystemMediaTransportControlsPropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsPropertyChangedEventArgs]
  }
}

