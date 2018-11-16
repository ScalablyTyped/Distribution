package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageScannerColorMode extends js.Object

/** Specifies the color modes for the scan source. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerColorMode")
@js.native
object ImageScannerColorMode extends js.Object {
  /** The device automatically detects the right color mode based on the scan content. In this case the decision between color, grayscale and black and white for example relies on the device, and not the app. */
  @js.native
  sealed trait autoColor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerColorMode
  
  /** 24-bit RGB color (3 channels at 8 bits per channel). */
  @js.native
  sealed trait color
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerColorMode
  
  /** 8 bit or 4 bit grayscale (1 channel at 8 or 4 bits per channel). If the device supports both 4 and 8 bit grayscale the DefaultColorMode property will use 8 bit. */
  @js.native
  sealed trait grayscale
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerColorMode
  
  /** 1 bit bi-tonal, also called monochrome or ‘black and white’ (1 channel at 1 bit per channel). */
  @js.native
  sealed trait monochrome
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerColorMode
  
  val autoColor: autoColor with java.lang.String = js.native
  val color: color with java.lang.String = js.native
  val grayscale: grayscale with java.lang.String = js.native
  val monochrome: monochrome with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerColorMode with java.lang.String
  ] = js.native
}

