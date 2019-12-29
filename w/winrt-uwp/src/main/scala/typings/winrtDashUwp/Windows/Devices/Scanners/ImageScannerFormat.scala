package typings.winrtDashUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageScannerFormat with Double] = js.native
  /* 2 */ @js.native
  object deviceIndependentBitmap extends TopLevel[deviceIndependentBitmap with Double]
  
  /* 0 */ @js.native
  object jpeg extends TopLevel[jpeg with Double]
  
  /* 5 */ @js.native
  object openXps extends TopLevel[openXps with Double]
  
  /* 6 */ @js.native
  object pdf extends TopLevel[pdf with Double]
  
  /* 1 */ @js.native
  object png extends TopLevel[png with Double]
  
  /* 3 */ @js.native
  object tiff extends TopLevel[tiff with Double]
  
  /* 4 */ @js.native
  object xps extends TopLevel[xps with Double]
  
}

