package typings.winrtUwp.Windows.Data.Pdf

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
trait PdfPageDimensions extends js.Object {
  /** Gets the size of a rectangle that contains the Portable Document Format (PDF) page's contents, including any meaningful surrounding white space, as intended by the PDF page's creator. */
  var artBox: Rect
  /** Gets the size of a rectangle that specifies the clipped region of a Portable Document Format (PDF) page's contents when it is displayed. */
  var bleedBox: Rect
  /** Gets the size of a rectangle that specifies the cropped region of a Portable Document Format (PDF) page's contents when it is displayed. */
  var cropBox: Rect
  /** Gets the size of a rectangle that defines the boundaries of the area that the Portable Document Format (PDF) page will be displayed or printed to. */
  var mediaBox: Rect
  /** Gets the size of a rectangle that specifies the intended dimensions of the Portable Document Format (PDF) page after it has been trimmed. */
  var trimBox: Rect
}

object PdfPageDimensions {
  @scala.inline
  def apply(artBox: Rect, bleedBox: Rect, cropBox: Rect, mediaBox: Rect, trimBox: Rect): PdfPageDimensions = {
    val __obj = js.Dynamic.literal(artBox = artBox.asInstanceOf[js.Any], bleedBox = bleedBox.asInstanceOf[js.Any], cropBox = cropBox.asInstanceOf[js.Any], mediaBox = mediaBox.asInstanceOf[js.Any], trimBox = trimBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfPageDimensions]
  }
}

