package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StoreSystemFeature with Double] = js.native
  /* 2 */ @js.native
  object architectureArm extends TopLevel[architectureArm with Double]
  
  /* 1 */ @js.native
  object architectureX64 extends TopLevel[architectureX64 with Double]
  
  /* 0 */ @js.native
  object architectureX86 extends TopLevel[architectureX86 with Double]
  
  /* 12 */ @js.native
  object cameraFront extends TopLevel[cameraFront with Double]
  
  /* 13 */ @js.native
  object cameraRear extends TopLevel[cameraRear with Double]
  
  /* 6 */ @js.native
  object d3D12HardwareFL11 extends TopLevel[d3D12HardwareFL11 with Double]
  
  /* 7 */ @js.native
  object d3D12HardwareFL12 extends TopLevel[d3D12HardwareFL12 with Double]
  
  /* 4 */ @js.native
  object directX10 extends TopLevel[directX10 with Double]
  
  /* 5 */ @js.native
  object directX11 extends TopLevel[directX11 with Double]
  
  /* 3 */ @js.native
  object directX9 extends TopLevel[directX9 with Double]
  
  /* 14 */ @js.native
  object gyroscope extends TopLevel[gyroscope with Double]
  
  /* 15 */ @js.native
  object hover extends TopLevel[hover with Double]
  
  /* 16 */ @js.native
  object magnetometer extends TopLevel[magnetometer with Double]
  
  /* 10 */ @js.native
  object memory1GB extends TopLevel[memory1GB with Double]
  
  /* 11 */ @js.native
  object memory2GB extends TopLevel[memory2GB with Double]
  
  /* 8 */ @js.native
  object memory300MB extends TopLevel[memory300MB with Double]
  
  /* 9 */ @js.native
  object memory750MB extends TopLevel[memory750MB with Double]
  
  /* 17 */ @js.native
  object nfc extends TopLevel[nfc with Double]
  
  /* 18 */ @js.native
  object resolution720P extends TopLevel[resolution720P with Double]
  
  /* 19 */ @js.native
  object resolutionWvga extends TopLevel[resolutionWvga with Double]
  
  /* 20 */ @js.native
  object resolutionWvgaOr720P extends TopLevel[resolutionWvgaOr720P with Double]
  
  /* 22 */ @js.native
  object resolutionWvgaOrWxga extends TopLevel[resolutionWvgaOrWxga with Double]
  
  /* 21 */ @js.native
  object resolutionWxga extends TopLevel[resolutionWxga with Double]
  
  /* 23 */ @js.native
  object resolutionWxgaOr720P extends TopLevel[resolutionWxgaOr720P with Double]
  
}

