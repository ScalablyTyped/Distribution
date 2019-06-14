package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs

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
  sealed trait architectureArm
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device chipset uses the x64 CPU architecture. */
  @js.native
  sealed trait architectureX64
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device chipset uses the x86 CPU architecture. */
  @js.native
  sealed trait architectureX86
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has a front-facing camera. */
  @js.native
  sealed trait cameraFront
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has a rear-facing camera. */
  @js.native
  sealed trait cameraRear
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device supports Direct3D 12 feature level 12.0. */
  @js.native
  sealed trait d3D12HardwareFL11
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device supports Direct3D 12 feature level 12.1. */
  @js.native
  sealed trait d3D12HardwareFL12
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device supports DirectX10. */
  @js.native
  sealed trait directX10
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device supports DirectX11. */
  @js.native
  sealed trait directX11
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device supports DirectX9. */
  @js.native
  sealed trait directX9
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has a gyroscope. */
  @js.native
  sealed trait gyroscope
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device supports hover touch. */
  @js.native
  sealed trait hover
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has a magnetometer. */
  @js.native
  sealed trait magnetometer
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has 1 GB of RAM. */
  @js.native
  sealed trait memory1GB
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has 2 GB of RAM. */
  @js.native
  sealed trait memory2GB
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has 300 MB of RAM. */
  @js.native
  sealed trait memory300MB
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device has 750 MB of RAM. */
  @js.native
  sealed trait memory750MB
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The device includes an NFC device. */
  @js.native
  sealed trait nfc
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The display resolution is 720p. */
  @js.native
  sealed trait resolution720P
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The display resolution is WVGA. */
  @js.native
  sealed trait resolutionWvga
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The display resolution is 720p or WVGA. */
  @js.native
  sealed trait resolutionWvgaOr720P
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The display resolution is WVGA or WXGA. */
  @js.native
  sealed trait resolutionWvgaOrWxga
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The display resolution is WXGA */
  @js.native
  sealed trait resolutionWxga
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /** The display resolution is WXGA or 720p. */
  @js.native
  sealed trait resolutionWxgaOr720P
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature
  
  /* 2 */ val architectureArm: architectureArm with scala.Double = js.native
  /* 1 */ val architectureX64: architectureX64 with scala.Double = js.native
  /* 0 */ val architectureX86: architectureX86 with scala.Double = js.native
  /* 12 */ val cameraFront: cameraFront with scala.Double = js.native
  /* 13 */ val cameraRear: cameraRear with scala.Double = js.native
  /* 6 */ val d3D12HardwareFL11: d3D12HardwareFL11 with scala.Double = js.native
  /* 7 */ val d3D12HardwareFL12: d3D12HardwareFL12 with scala.Double = js.native
  /* 4 */ val directX10: directX10 with scala.Double = js.native
  /* 5 */ val directX11: directX11 with scala.Double = js.native
  /* 3 */ val directX9: directX9 with scala.Double = js.native
  /* 14 */ val gyroscope: gyroscope with scala.Double = js.native
  /* 15 */ val hover: hover with scala.Double = js.native
  /* 16 */ val magnetometer: magnetometer with scala.Double = js.native
  /* 10 */ val memory1GB: memory1GB with scala.Double = js.native
  /* 11 */ val memory2GB: memory2GB with scala.Double = js.native
  /* 8 */ val memory300MB: memory300MB with scala.Double = js.native
  /* 9 */ val memory750MB: memory750MB with scala.Double = js.native
  /* 17 */ val nfc: nfc with scala.Double = js.native
  /* 18 */ val resolution720P: resolution720P with scala.Double = js.native
  /* 19 */ val resolutionWvga: resolutionWvga with scala.Double = js.native
  /* 20 */ val resolutionWvgaOr720P: resolutionWvgaOr720P with scala.Double = js.native
  /* 22 */ val resolutionWvgaOrWxga: resolutionWvgaOrWxga with scala.Double = js.native
  /* 21 */ val resolutionWxga: resolutionWxga with scala.Double = js.native
  /* 23 */ val resolutionWxgaOr720P: resolutionWxgaOr720P with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature with scala.Double
  ] = js.native
}

