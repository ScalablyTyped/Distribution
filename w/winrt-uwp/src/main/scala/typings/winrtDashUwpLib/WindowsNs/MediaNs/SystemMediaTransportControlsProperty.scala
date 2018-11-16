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
  
  val soundLevel: soundLevel with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsProperty with java.lang.String
  ] = js.native
}

