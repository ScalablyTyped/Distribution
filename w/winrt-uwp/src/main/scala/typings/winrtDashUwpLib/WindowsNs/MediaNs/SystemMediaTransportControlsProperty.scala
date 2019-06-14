package typings
package winrtDashUwpLib.WindowsNs.MediaNs

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
  sealed trait soundLevel
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsProperty
  
  /* 0 */ val soundLevel: soundLevel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsProperty with scala.Double
  ] = js.native
}

