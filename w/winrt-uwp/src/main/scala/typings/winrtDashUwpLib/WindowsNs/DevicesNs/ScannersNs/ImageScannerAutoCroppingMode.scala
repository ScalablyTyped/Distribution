package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageScannerAutoCroppingMode extends js.Object

/** Specifies the automatic crop mode of the scanning device. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerAutoCroppingMode")
@js.native
object ImageScannerAutoCroppingMode extends js.Object {
  /** Automatic detection is disabled. At the beginning of a new scan session, the AutoCroppingMode property is set to this value by default. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerAutoCroppingMode
  
  /** Scan multiple scan regions into individual, separate images. */
  @js.native
  sealed trait multipleRegion
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerAutoCroppingMode
  
  /** Scan a single scan region into individual, separate images. */
  @js.native
  sealed trait singleRegion
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerAutoCroppingMode
  
  val disabled: disabled with java.lang.String = js.native
  val multipleRegion: multipleRegion with java.lang.String = js.native
  val singleRegion: singleRegion with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerAutoCroppingMode with java.lang.String
  ] = js.native
}

