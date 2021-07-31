package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StoreSystemFeature extends StObject
/** Defines values that represent hardware features that can be queried for the current device by using the FilterUnsupportedSystemFeaturesAsync method. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StoreSystemFeature")
@js.native
object StoreSystemFeature extends StObject {
  
  /** The device chipset uses the ARM CPU architecture. */
  @js.native
  sealed trait architectureArm
    extends StObject
       with StoreSystemFeature
  
  /** The device chipset uses the x64 CPU architecture. */
  @js.native
  sealed trait architectureX64
    extends StObject
       with StoreSystemFeature
  
  /** The device chipset uses the x86 CPU architecture. */
  @js.native
  sealed trait architectureX86
    extends StObject
       with StoreSystemFeature
  
  /** The device has a front-facing camera. */
  @js.native
  sealed trait cameraFront
    extends StObject
       with StoreSystemFeature
  
  /** The device has a rear-facing camera. */
  @js.native
  sealed trait cameraRear
    extends StObject
       with StoreSystemFeature
  
  /** The device supports Direct3D 12 feature level 12.0. */
  @js.native
  sealed trait d3D12HardwareFL11
    extends StObject
       with StoreSystemFeature
  
  /** The device supports Direct3D 12 feature level 12.1. */
  @js.native
  sealed trait d3D12HardwareFL12
    extends StObject
       with StoreSystemFeature
  
  /** The device supports DirectX10. */
  @js.native
  sealed trait directX10
    extends StObject
       with StoreSystemFeature
  
  /** The device supports DirectX11. */
  @js.native
  sealed trait directX11
    extends StObject
       with StoreSystemFeature
  
  /** The device supports DirectX9. */
  @js.native
  sealed trait directX9
    extends StObject
       with StoreSystemFeature
  
  /** The device has a gyroscope. */
  @js.native
  sealed trait gyroscope
    extends StObject
       with StoreSystemFeature
  
  /** The device supports hover touch. */
  @js.native
  sealed trait hover
    extends StObject
       with StoreSystemFeature
  
  /** The device has a magnetometer. */
  @js.native
  sealed trait magnetometer
    extends StObject
       with StoreSystemFeature
  
  /** The device has 1 GB of RAM. */
  @js.native
  sealed trait memory1GB
    extends StObject
       with StoreSystemFeature
  
  /** The device has 2 GB of RAM. */
  @js.native
  sealed trait memory2GB
    extends StObject
       with StoreSystemFeature
  
  /** The device has 300 MB of RAM. */
  @js.native
  sealed trait memory300MB
    extends StObject
       with StoreSystemFeature
  
  /** The device has 750 MB of RAM. */
  @js.native
  sealed trait memory750MB
    extends StObject
       with StoreSystemFeature
  
  /** The device includes an NFC device. */
  @js.native
  sealed trait nfc
    extends StObject
       with StoreSystemFeature
  
  /** The display resolution is 720p. */
  @js.native
  sealed trait resolution720P
    extends StObject
       with StoreSystemFeature
  
  /** The display resolution is WVGA. */
  @js.native
  sealed trait resolutionWvga
    extends StObject
       with StoreSystemFeature
  
  /** The display resolution is 720p or WVGA. */
  @js.native
  sealed trait resolutionWvgaOr720P
    extends StObject
       with StoreSystemFeature
  
  /** The display resolution is WVGA or WXGA. */
  @js.native
  sealed trait resolutionWvgaOrWxga
    extends StObject
       with StoreSystemFeature
  
  /** The display resolution is WXGA */
  @js.native
  sealed trait resolutionWxga
    extends StObject
       with StoreSystemFeature
  
  /** The display resolution is WXGA or 720p. */
  @js.native
  sealed trait resolutionWxgaOr720P
    extends StObject
       with StoreSystemFeature
}
