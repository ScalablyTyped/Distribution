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
  
  val architectureArm: architectureArm with java.lang.String = js.native
  val architectureX64: architectureX64 with java.lang.String = js.native
  val architectureX86: architectureX86 with java.lang.String = js.native
  val cameraFront: cameraFront with java.lang.String = js.native
  val cameraRear: cameraRear with java.lang.String = js.native
  val d3D12HardwareFL11: d3D12HardwareFL11 with java.lang.String = js.native
  val d3D12HardwareFL12: d3D12HardwareFL12 with java.lang.String = js.native
  val directX10: directX10 with java.lang.String = js.native
  val directX11: directX11 with java.lang.String = js.native
  val directX9: directX9 with java.lang.String = js.native
  val gyroscope: gyroscope with java.lang.String = js.native
  val hover: hover with java.lang.String = js.native
  val magnetometer: magnetometer with java.lang.String = js.native
  val memory1GB: memory1GB with java.lang.String = js.native
  val memory2GB: memory2GB with java.lang.String = js.native
  val memory300MB: memory300MB with java.lang.String = js.native
  val memory750MB: memory750MB with java.lang.String = js.native
  val nfc: nfc with java.lang.String = js.native
  val resolution720P: resolution720P with java.lang.String = js.native
  val resolutionWvga: resolutionWvga with java.lang.String = js.native
  val resolutionWvgaOr720P: resolutionWvgaOr720P with java.lang.String = js.native
  val resolutionWvgaOrWxga: resolutionWvgaOrWxga with java.lang.String = js.native
  val resolutionWxga: resolutionWxga with java.lang.String = js.native
  val resolutionWxgaOr720P: resolutionWxgaOr720P with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StoreSystemFeature with java.lang.String
  ] = js.native
}

