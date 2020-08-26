package typings.winrtUwp.Windows.Data.Pdf

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
@js.native
trait PdfPageDimensions extends js.Object {
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

object PdfPageDimensions {
  @scala.inline
  def apply(artBox: Rect, bleedBox: Rect, cropBox: Rect, mediaBox: Rect, trimBox: Rect): PdfPageDimensions = {
    val __obj = js.Dynamic.literal(artBox = artBox.asInstanceOf[js.Any], bleedBox = bleedBox.asInstanceOf[js.Any], cropBox = cropBox.asInstanceOf[js.Any], mediaBox = mediaBox.asInstanceOf[js.Any], trimBox = trimBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfPageDimensions]
  }
  @scala.inline
  implicit class PdfPageDimensionsOps[Self <: PdfPageDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArtBox(value: Rect): Self = this.set("artBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setBleedBox(value: Rect): Self = this.set("bleedBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropBox(value: Rect): Self = this.set("cropBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaBox(value: Rect): Self = this.set("mediaBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrimBox(value: Rect): Self = this.set("trimBox", value.asInstanceOf[js.Any])
  }
  
}

