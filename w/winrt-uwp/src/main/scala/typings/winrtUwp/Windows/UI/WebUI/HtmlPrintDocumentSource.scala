package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the document source for app printing. */
trait HtmlPrintDocumentSource extends js.Object {
  /** Gets and sets the bottom margin of the document source. */
  var bottomMargin: Double
  /** Gets and sets the content of the document source to print. */
  var content: PrintContent
  /** Gets and sets a value that controls whether header and footer are enabled in the document source. */
  var enableHeaderFooter: Boolean
  /** Gets and sets the left margin of the document source. */
  var leftMargin: Double
  /** Gets the range of pages that prints. */
  var pageRange: String
  /** Gets and sets the size of the document source by percentage. */
  var percentScale: Double
  /** Gets and sets the right margin of the document source. */
  var rightMargin: Double
  /** Gets and sets a value that controls whether content shrinks to fit the document source. */
  var shrinkToFit: Boolean
  /** Gets and sets the top margin of the document source. */
  var topMargin: Double
  /** Performs app-defined tasks that are associated with freeing, releasing, or resetting resources that were allocated for the document source. */
  def close(): Unit
  /**
    * Tries to set the page range of the document source.
    * @param strPageRange The page range to set.
    * @return A Boolean value that indicates whether trySetPageRange set the page range in strPageRange. TRUE indicates the page range was set and FALSE otherwise.
    */
  def trySetPageRange(strPageRange: String): Boolean
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
}

