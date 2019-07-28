package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs

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
  
  /* 2 */ val architectureArm: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.architectureArm with Double = js.native
  /* 1 */ val architectureX64: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.architectureX64 with Double = js.native
  /* 0 */ val architectureX86: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.architectureX86 with Double = js.native
  /* 12 */ val cameraFront: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.cameraFront with Double = js.native
  /* 13 */ val cameraRear: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.cameraRear with Double = js.native
  /* 6 */ val d3D12HardwareFL11: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.d3D12HardwareFL11 with Double = js.native
  /* 7 */ val d3D12HardwareFL12: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.d3D12HardwareFL12 with Double = js.native
  /* 4 */ val directX10: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.directX10 with Double = js.native
  /* 5 */ val directX11: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.directX11 with Double = js.native
  /* 3 */ val directX9: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.directX9 with Double = js.native
  /* 14 */ val gyroscope: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.gyroscope with Double = js.native
  /* 15 */ val hover: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.hover with Double = js.native
  /* 16 */ val magnetometer: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.magnetometer with Double = js.native
  /* 10 */ val memory1GB: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.memory1GB with Double = js.native
  /* 11 */ val memory2GB: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.memory2GB with Double = js.native
  /* 8 */ val memory300MB: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.memory300MB with Double = js.native
  /* 9 */ val memory750MB: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.memory750MB with Double = js.native
  /* 17 */ val nfc: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.nfc with Double = js.native
  /* 18 */ val resolution720P: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.resolution720P with Double = js.native
  /* 19 */ val resolutionWvga: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.resolutionWvga with Double = js.native
  /* 20 */ val resolutionWvgaOr720P: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.resolutionWvgaOr720P with Double = js.native
  /* 22 */ val resolutionWvgaOrWxga: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.resolutionWvgaOrWxga with Double = js.native
  /* 21 */ val resolutionWxga: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.resolutionWxga with Double = js.native
  /* 23 */ val resolutionWxgaOr720P: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature.resolutionWxgaOr720P with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StoreSystemFeature with Double] = js.native
}

