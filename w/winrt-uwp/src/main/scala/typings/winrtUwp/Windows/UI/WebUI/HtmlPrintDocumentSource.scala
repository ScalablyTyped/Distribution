package typings.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages the document source for app printing. */
@js.native
trait HtmlPrintDocumentSource extends StObject {
  
  /** Gets and sets the bottom margin of the document source. */
  var bottomMargin: Double = js.native
  
  /** Performs app-defined tasks that are associated with freeing, releasing, or resetting resources that were allocated for the document source. */
  def close(): Unit = js.native
  
  /** Gets and sets the content of the document source to print. */
  var content: PrintContent = js.native
  
  /** Gets and sets a value that controls whether header and footer are enabled in the document source. */
  var enableHeaderFooter: Boolean = js.native
  
  /** Gets and sets the left margin of the document source. */
  var leftMargin: Double = js.native
  
  /** Gets the range of pages that prints. */
  var pageRange: String = js.native
  
  /** Gets and sets the size of the document source by percentage. */
  var percentScale: Double = js.native
  
  /** Gets and sets the right margin of the document source. */
  var rightMargin: Double = js.native
  
  /** Gets and sets a value that controls whether content shrinks to fit the document source. */
  var shrinkToFit: Boolean = js.native
  
  /** Gets and sets the top margin of the document source. */
  var topMargin: Double = js.native
  
  /**
    * Tries to set the page range of the document source.
    * @param strPageRange The page range to set.
    * @return A Boolean value that indicates whether trySetPageRange set the page range in strPageRange. TRUE indicates the page range was set and FALSE otherwise.
    */
  def trySetPageRange(strPageRange: String): Boolean = js.native
}
object HtmlPrintDocumentSource {
  
  @scala.inline
  def apply(
    bottomMargin: Double,
    close: () => Unit,
    content: PrintContent,
    enableHeaderFooter: Boolean,
    leftMargin: Double,
    pageRange: String,
    percentScale: Double,
    rightMargin: Double,
    shrinkToFit: Boolean,
    topMargin: Double,
    trySetPageRange: String => Boolean
  ): HtmlPrintDocumentSource = {
    val __obj = js.Dynamic.literal(bottomMargin = bottomMargin.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), content = content.asInstanceOf[js.Any], enableHeaderFooter = enableHeaderFooter.asInstanceOf[js.Any], leftMargin = leftMargin.asInstanceOf[js.Any], pageRange = pageRange.asInstanceOf[js.Any], percentScale = percentScale.asInstanceOf[js.Any], rightMargin = rightMargin.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], topMargin = topMargin.asInstanceOf[js.Any], trySetPageRange = js.Any.fromFunction1(trySetPageRange))
    __obj.asInstanceOf[HtmlPrintDocumentSource]
  }
  
  @scala.inline
  implicit class HtmlPrintDocumentSourceMutableBuilder[Self <: HtmlPrintDocumentSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContent(value: PrintContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHeaderFooter(value: Boolean): Self = StObject.set(x, "enableHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRange(value: String): Self = StObject.set(x, "pageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentScale(value: Double): Self = StObject.set(x, "percentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrySetPageRange(value: String => Boolean): Self = StObject.set(x, "trySetPageRange", js.Any.fromFunction1(value))
  }
}
