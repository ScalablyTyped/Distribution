package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static properties of infrared frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties")
@js.native
abstract class KnownPerceptionInfraredFrameSourceProperties () extends js.Object

/** Provides static properties of infrared frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties")
@js.native
object KnownPerceptionInfraredFrameSourceProperties extends js.Object {
  /** Gets a string key used to retrieve a Boolean property indicating whether or not active IR illumination is enabled. */
  var activeIlluminationEnabled: java.lang.String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not ambient IR light subtraction is enabled. */
  var ambientSubtractionEnabled: java.lang.String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not auto exposure is enabled. */
  var autoExposureEnabled: java.lang.String = js.native
  /** Gets a string key used to retrieve a TimeSpan property indicating the current exposure duration of the camera. */
  var exposure: java.lang.String = js.native
  /** Gets a string key used to retrieve a single-precision, floating-point property indicating the amount of exposure compensation. */
  var exposureCompensation: java.lang.String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not interleaved illumination is enabled. */
  var interleavedIlluminationEnabled: java.lang.String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not the structured light pattern is enabled. */
  var structureLightPatternEnabled: java.lang.String = js.native
}

