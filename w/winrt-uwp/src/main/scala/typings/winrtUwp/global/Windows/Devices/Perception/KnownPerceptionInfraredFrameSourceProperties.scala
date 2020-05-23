package typings.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static properties of infrared frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties")
@js.native
abstract class KnownPerceptionInfraredFrameSourceProperties ()
  extends typings.winrtUwp.Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties

/* static members */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties")
@js.native
object KnownPerceptionInfraredFrameSourceProperties extends js.Object {
  /** Gets a string key used to retrieve a Boolean property indicating whether or not active IR illumination is enabled. */
  var activeIlluminationEnabled: String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not ambient IR light subtraction is enabled. */
  var ambientSubtractionEnabled: String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not auto exposure is enabled. */
  var autoExposureEnabled: String = js.native
  /** Gets a string key used to retrieve a TimeSpan property indicating the current exposure duration of the camera. */
  var exposure: String = js.native
  /** Gets a string key used to retrieve a single-precision, floating-point property indicating the amount of exposure compensation. */
  var exposureCompensation: String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not interleaved illumination is enabled. */
  var interleavedIlluminationEnabled: String = js.native
  /** Gets a string key used to retrieve a Boolean property indicating whether or not the structured light pattern is enabled. */
  var structureLightPatternEnabled: String = js.native
}

