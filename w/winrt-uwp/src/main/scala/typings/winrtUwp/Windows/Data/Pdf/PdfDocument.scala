package typings.winrtUwp.Windows.Data.Pdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Portable Document Format (PDF) document. */
trait PdfDocument extends js.Object {
  /** Gets whether the Portable Document Format (PDF) document is password-protected. */
  var isPasswordProtected: Boolean
  /** Gets the number of pages in the Portable Document Format (PDF) document. */
  var pageCount: Double
  /**
    * Gets a page from a Portable Document Format (PDF) document.
    * @param pageIndex The location of the PDF page relative to its parent document.
    * @return The PDF page.
    */
  def getPage(pageIndex: Double): PdfPage
}

object PdfDocument {
  @scala.inline
  def apply(getPage: Double => PdfPage, isPasswordProtected: Boolean, pageCount: Double): PdfDocument = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction1(getPage), isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfDocument]
  }
}

