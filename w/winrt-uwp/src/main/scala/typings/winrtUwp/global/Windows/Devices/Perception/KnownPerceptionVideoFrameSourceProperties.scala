package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties of video frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties")
@js.native
abstract class KnownPerceptionVideoFrameSourceProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties
object KnownPerceptionVideoFrameSourceProperties {
  
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets a string key used to retrieve a boolean property indicating the supported video profiles that are currently available. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties.availableVideoProfiles")
  @js.native
  def availableVideoProfiles: String = js.native
  inline def availableVideoProfiles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableVideoProfiles")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a CameraIntrinsics property defining the physical properties of the camera device. The CameraIntrinsics object also provides convenience methods for sensor-related geometry, including camera space to image space projections. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties.cameraIntrinsics")
  @js.native
  def cameraIntrinsics: String = js.native
  inline def cameraIntrinsics_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cameraIntrinsics")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a boolean property indicating whether or not the video frame source is providing mirrored video frames. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties.isMirrored")
  @js.native
  def isMirrored: String = js.native
  inline def isMirrored_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMirrored")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve the supported video profiles property. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties.supportedVideoProfiles")
  @js.native
  def supportedVideoProfiles: String = js.native
  inline def supportedVideoProfiles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedVideoProfiles")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve the current video profile property. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties.videoProfile")
  @js.native
  def videoProfile: String = js.native
  inline def videoProfile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videoProfile")(x.asInstanceOf[js.Any])
}
