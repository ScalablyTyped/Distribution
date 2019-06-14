package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageScannerFormat extends js.Object

/** The type of files to scan to. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerFormat")
@js.native
object ImageScannerFormat extends js.Object {
  /** Windows Device Independent Bitmap (DIB) */
  @js.native
  sealed trait deviceIndependentBitmap
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat
  
  /** Exchangeable image file format/EXIF or JPEG file interchange format/JFIF */
  @js.native
  sealed trait jpeg
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat
  
  /** Open XML Paper Specification (OpenXPS) document file format */
  @js.native
  sealed trait openXps
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat
  
  /** Portable Document Format PDF/A (PDF/A is an ISO-standardized version of the Portable Document Format/PDF specialized for the digital preservation of electronic documents) document file format */
  @js.native
  sealed trait pdf
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat
  
  /** Portable Network Graphics (PNG) image file format */
  @js.native
  sealed trait png
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat
  
  /** Uncompressed Tagged Image File Format (TIFF) compatible with the TIFF 6.0 specification, either single and/or multi-page */
  @js.native
  sealed trait tiff
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat
  
  /** Microsoft XML Paper Specification (XPS) document file format */
  @js.native
  sealed trait xps
    extends winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat
  
  /* 2 */ val deviceIndependentBitmap: deviceIndependentBitmap with scala.Double = js.native
  /* 0 */ val jpeg: jpeg with scala.Double = js.native
  /* 5 */ val openXps: openXps with scala.Double = js.native
  /* 6 */ val pdf: pdf with scala.Double = js.native
  /* 1 */ val png: png with scala.Double = js.native
  /* 3 */ val tiff: tiff with scala.Double = js.native
  /* 4 */ val xps: xps with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScannerFormat with scala.Double
  ] = js.native
}

