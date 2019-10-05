package typings.winrtDashUwp.Windows.Devices.Scanners

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
  sealed trait deviceIndependentBitmap extends ImageScannerFormat
  
  /** Exchangeable image file format/EXIF or JPEG file interchange format/JFIF */
  @js.native
  sealed trait jpeg extends ImageScannerFormat
  
  /** Open XML Paper Specification (OpenXPS) document file format */
  @js.native
  sealed trait openXps extends ImageScannerFormat
  
  /** Portable Document Format PDF/A (PDF/A is an ISO-standardized version of the Portable Document Format/PDF specialized for the digital preservation of electronic documents) document file format */
  @js.native
  sealed trait pdf extends ImageScannerFormat
  
  /** Portable Network Graphics (PNG) image file format */
  @js.native
  sealed trait png extends ImageScannerFormat
  
  /** Uncompressed Tagged Image File Format (TIFF) compatible with the TIFF 6.0 specification, either single and/or multi-page */
  @js.native
  sealed trait tiff extends ImageScannerFormat
  
  /** Microsoft XML Paper Specification (XPS) document file format */
  @js.native
  sealed trait xps extends ImageScannerFormat
  
  /* 2 */ val deviceIndependentBitmap: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerFormat.deviceIndependentBitmap with Double = js.native
  /* 0 */ val jpeg: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerFormat.jpeg with Double = js.native
  /* 5 */ val openXps: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerFormat.openXps with Double = js.native
  /* 6 */ val pdf: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerFormat.pdf with Double = js.native
  /* 1 */ val png: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerFormat.png with Double = js.native
  /* 3 */ val tiff: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerFormat.tiff with Double = js.native
  /* 4 */ val xps: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerFormat.xps with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageScannerFormat with Double] = js.native
}

