package typings.winrtDashUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemMediaTransportControlsProperty extends js.Object

/** Defines values for the properties on the SystemMediaTransportControls . */
@JSGlobal("Windows.Media.SystemMediaTransportControlsProperty")
@js.native
object SystemMediaTransportControlsProperty extends js.Object {
  /** The sound level property. */
  @js.native
  sealed trait soundLevel extends SystemMediaTransportControlsProperty
  
  /* 0 */ val soundLevel: typings.winrtDashUwp.Windows.Media.SystemMediaTransportControlsProperty.soundLevel with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemMediaTransportControlsProperty with Double] = js.native
}

