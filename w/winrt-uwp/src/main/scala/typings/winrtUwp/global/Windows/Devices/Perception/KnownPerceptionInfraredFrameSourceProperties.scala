package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties of infrared frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties")
@js.native
abstract class KnownPerceptionInfraredFrameSourceProperties ()
  extends typings.winrtUwp.Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties
object KnownPerceptionInfraredFrameSourceProperties {
  
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets a string key used to retrieve a Boolean property indicating whether or not active IR illumination is enabled. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties.activeIlluminationEnabled")
  @js.native
  def activeIlluminationEnabled: String = js.native
  @scala.inline
  def activeIlluminationEnabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeIlluminationEnabled")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a Boolean property indicating whether or not ambient IR light subtraction is enabled. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties.ambientSubtractionEnabled")
  @js.native
  def ambientSubtractionEnabled: String = js.native
  @scala.inline
  def ambientSubtractionEnabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ambientSubtractionEnabled")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a Boolean property indicating whether or not auto exposure is enabled. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties.autoExposureEnabled")
  @js.native
  def autoExposureEnabled: String = js.native
  @scala.inline
  def autoExposureEnabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoExposureEnabled")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a TimeSpan property indicating the current exposure duration of the camera. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties.exposure")
  @js.native
  def exposure: String = js.native
  
  /** Gets a string key used to retrieve a single-precision, floating-point property indicating the amount of exposure compensation. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties.exposureCompensation")
  @js.native
  def exposureCompensation: String = js.native
  @scala.inline
  def exposureCompensation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def exposure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exposure")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a Boolean property indicating whether or not interleaved illumination is enabled. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties.interleavedIlluminationEnabled")
  @js.native
  def interleavedIlluminationEnabled: String = js.native
  @scala.inline
  def interleavedIlluminationEnabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interleavedIlluminationEnabled")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a Boolean property indicating whether or not the structured light pattern is enabled. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties.structureLightPatternEnabled")
  @js.native
  def structureLightPatternEnabled: String = js.native
  @scala.inline
  def structureLightPatternEnabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureLightPatternEnabled")(x.asInstanceOf[js.Any])
}
