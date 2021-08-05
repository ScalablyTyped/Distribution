package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties of color frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties")
@js.native
abstract class KnownPerceptionColorFrameSourceProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties
object KnownPerceptionColorFrameSourceProperties {
  
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets a string key used to retrieve a Boolean property indicating whether or not auto exposure is enabled. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties.autoExposureEnabled")
  @js.native
  def autoExposureEnabled: String = js.native
  inline def autoExposureEnabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoExposureEnabled")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a TimeSpan property indicating the current exposure duration of the camera. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties.exposure")
  @js.native
  def exposure: String = js.native
  
  /** Gets a string key used to retrieve a single-precision, floating-point property indicating the exposure compensation. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties.exposureCompensation")
  @js.native
  def exposureCompensation: String = js.native
  inline def exposureCompensation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(x.asInstanceOf[js.Any])
  
  inline def exposure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exposure")(x.asInstanceOf[js.Any])
}
