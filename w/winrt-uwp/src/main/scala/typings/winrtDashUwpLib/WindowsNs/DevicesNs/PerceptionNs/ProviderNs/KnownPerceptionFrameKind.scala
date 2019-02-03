package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A string used to identify the type classification of a frame. */
@JSGlobal("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind")
@js.native
abstract class KnownPerceptionFrameKind () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind")
@js.native
object KnownPerceptionFrameKind extends js.Object {
  /** Gets the string representing the Color FrameKind of a PerceptionFrameProviderInfo. */
  var color: java.lang.String = js.native
  /** Gets the string representing the Depth FrameKind of a PerceptionFrameProviderInfo. */
  var depth: java.lang.String = js.native
  /** Gets the string representing the Infrared FrameKind of a PerceptionFrameProviderInfo. */
  var infrared: java.lang.String = js.native
}

