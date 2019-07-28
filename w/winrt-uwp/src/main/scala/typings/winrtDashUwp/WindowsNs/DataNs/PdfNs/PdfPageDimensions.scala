package typings.winrtDashUwp.WindowsNs.DataNs.PdfNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
@JSGlobal("Windows.Data.Pdf.PdfPageDimensions")
@js.native
abstract class PdfPageDimensions () extends js.Object {
  /** Gets the size of a rectangle that contains the Portable Document Format (PDF) page's contents, including any meaningful surrounding white space, as intended by the PDF page's creator. */
  var artBox: Rect = js.native
  /** Gets the size of a rectangle that specifies the clipped region of a Portable Document Format (PDF) page's contents when it is displayed. */
  var bleedBox: Rect = js.native
  /** Gets the size of a rectangle that specifies the cropped region of a Portable Document Format (PDF) page's contents when it is displayed. */
  var cropBox: Rect = js.native
  /** Gets the size of a rectangle that defines the boundaries of the area that the Portable Document Format (PDF) page will be displayed or printed to. */
  var mediaBox: Rect = js.native
  /** Gets the size of a rectangle that specifies the intended dimensions of the Portable Document Format (PDF) page after it has been trimmed. */
  var trimBox: Rect = js.native
}

