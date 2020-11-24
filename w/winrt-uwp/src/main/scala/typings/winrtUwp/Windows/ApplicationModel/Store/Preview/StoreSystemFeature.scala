package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StoreSystemFeature extends js.Object
/** Defines values that represent hardware features that can be queried for the current device by using the FilterUnsupportedSystemFeaturesAsync method. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StoreSystemFeature")
@js.native
object StoreSystemFeature extends js.Object {
  
  /** The device chipset uses the ARM CPU architecture. */
  @js.native
  sealed trait architectureArm extends StoreSystemFeature
  
  /** The device chipset uses the x64 CPU architecture. */
  @js.native
  sealed trait architectureX64 extends StoreSystemFeature
  
  /** The device chipset uses the x86 CPU architecture. */
  @js.native
  sealed trait architectureX86 extends StoreSystemFeature
  
  /** The device has a front-facing camera. */
  @js.native
  sealed trait cameraFront extends StoreSystemFeature
  
  /** The device has a rear-facing camera. */
  @js.native
  sealed trait cameraRear extends StoreSystemFeature
  
  /** The device supports Direct3D 12 feature level 12.0. */
  @js.native
  sealed trait d3D12HardwareFL11 extends StoreSystemFeature
  
  /** The device supports Direct3D 12 feature level 12.1. */
  @js.native
  sealed trait d3D12HardwareFL12 extends StoreSystemFeature
  
  /** The device supports DirectX10. */
  @js.native
  sealed trait directX10 extends StoreSystemFeature
  
  /** The device supports DirectX11. */
  @js.native
  sealed trait directX11 extends StoreSystemFeature
  
  /** The device supports DirectX9. */
  @js.native
  sealed trait directX9 extends StoreSystemFeature
  
  /** The device has a gyroscope. */
  @js.native
  sealed trait gyroscope extends StoreSystemFeature
  
  /** The device supports hover touch. */
  @js.native
  sealed trait hover extends StoreSystemFeature
  
  /** The device has a magnetometer. */
  @js.native
  sealed trait magnetometer extends StoreSystemFeature
  
  /** The device has 1 GB of RAM. */
  @js.native
  sealed trait memory1GB extends StoreSystemFeature
  
  /** The device has 2 GB of RAM. */
  @js.native
  sealed trait memory2GB extends StoreSystemFeature
  
  /** The device has 300 MB of RAM. */
  @js.native
  sealed trait memory300MB extends StoreSystemFeature
  
  /** The device has 750 MB of RAM. */
  @js.native
  sealed trait memory750MB extends StoreSystemFeature
  
  /** The device includes an NFC device. */
  @js.native
  sealed trait nfc extends StoreSystemFeature
  
  /** The display resolution is 720p. */
  @js.native
  sealed trait resolution720P extends StoreSystemFeature
  
  /** The display resolution is WVGA. */
  @js.native
  sealed trait resolutionWvga extends StoreSystemFeature
  
  /** The display resolution is 720p or WVGA. */
  @js.native
  sealed trait resolutionWvgaOr720P extends StoreSystemFeature
  
  /** The display resolution is WVGA or WXGA. */
  @js.native
  sealed trait resolutionWvgaOrWxga extends StoreSystemFeature
  
  /** The display resolution is WXGA */
  @js.native
  sealed trait resolutionWxga extends StoreSystemFeature
  
  /** The display resolution is WXGA or 720p. */
  @js.native
  sealed trait resolutionWxgaOr720P extends StoreSystemFeature
}
