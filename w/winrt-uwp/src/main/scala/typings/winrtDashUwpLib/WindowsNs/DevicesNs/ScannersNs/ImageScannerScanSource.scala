package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageScannerScanSource extends js.Object

/** The types of scan source for the scanning device. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerScanSource")
@js.native
object ImageScannerScanSource extends js.Object {
  /** The scan source is automatically configured. */
  @js.native
  sealed trait autoConfigured
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerScanSource
  
  /** The default source. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerScanSource
  
  /** A Feeder scan source. */
  @js.native
  sealed trait feeder
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerScanSource
  
  /** A Flatbed scan source. */
  @js.native
  sealed trait flatbed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerScanSource
  
  /* 3 */ val autoConfigured: autoConfigured with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 2 */ val feeder: feeder with scala.Double = js.native
  /* 1 */ val flatbed: flatbed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerScanSource with scala.Double
  ] = js.native
}

