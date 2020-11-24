package typings.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties of color frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties")
@js.native
abstract class KnownPerceptionColorFrameSourceProperties ()
  extends typings.winrtUwp.Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties
/* static members */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties")
@js.native
object KnownPerceptionColorFrameSourceProperties extends js.Object {
  
  /** Gets a string key used to retrieve a Boolean property indicating whether or not auto exposure is enabled. */
  var autoExposureEnabled: String = js.native
  
  /** Gets a string key used to retrieve a TimeSpan property indicating the current exposure duration of the camera. */
  var exposure: String = js.native
  
  /** Gets a string key used to retrieve a single-precision, floating-point property indicating the exposure compensation. */
  var exposureCompensation: String = js.native
}
