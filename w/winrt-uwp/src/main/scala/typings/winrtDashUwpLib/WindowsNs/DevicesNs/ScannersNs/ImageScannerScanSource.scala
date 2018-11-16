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
  
  val autoConfigured: autoConfigured with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val feeder: feeder with java.lang.String = js.native
  val flatbed: flatbed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerScanSource with java.lang.String
  ] = js.native
}

