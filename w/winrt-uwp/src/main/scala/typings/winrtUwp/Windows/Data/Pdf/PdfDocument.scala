package typings.winrtUwp.Windows.Data.Pdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Portable Document Format (PDF) document. */
@js.native
trait PdfDocument extends js.Object {
  
  /**
    * Gets a page from a Portable Document Format (PDF) document.
    * @param pageIndex The location of the PDF page relative to its parent document.
    * @return The PDF page.
    */
  def getPage(pageIndex: Double): PdfPage = js.native
  
  /** Gets whether the Portable Document Format (PDF) document is password-protected. */
  var isPasswordProtected: Boolean = js.native
  
  /** Gets the number of pages in the Portable Document Format (PDF) document. */
  var pageCount: Double = js.native
}
object PdfDocument {
  
  @scala.inline
  def apply(getPage: Double => PdfPage, isPasswordProtected: Boolean, pageCount: Double): PdfDocument = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction1(getPage), isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfDocument]
  }
  
  @scala.inline
  implicit class PdfDocumentOps[Self <: PdfDocument] (val x: Self) extends AnyVal {
    
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
    def setGetPage(value: Double => PdfPage): Self = this.set("getPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPasswordProtected(value: Boolean): Self = this.set("isPasswordProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
  }
}
