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
  
  /* 0 */ val disabled: disabled with scala.Double = js.native
  /* 2 */ val multipleRegion: multipleRegion with scala.Double = js.native
  /* 1 */ val singleRegion: singleRegion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerAutoCroppingMode with scala.Double
  ] = js.native
}

