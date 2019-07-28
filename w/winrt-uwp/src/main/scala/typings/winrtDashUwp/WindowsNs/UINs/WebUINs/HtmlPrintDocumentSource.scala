package typings.winrtDashUwp.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the document source for app printing. */
@JSGlobal("Windows.UI.WebUI.HtmlPrintDocumentSource")
@js.native
abstract class HtmlPrintDocumentSource () extends js.Object {
  /** Gets and sets the bottom margin of the document source. */
  var bottomMargin: Double = js.native
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
  /** Performs app-defined tasks that are associated with freeing, releasing, or resetting resources that were allocated for the document source. */
  def close(): Unit = js.native
  /**
    * Tries to set the page range of the document source.
    * @param strPageRange The page range to set.
    * @return A Boolean value that indicates whether trySetPageRange set the page range in strPageRange. TRUE indicates the page range was set and FALSE otherwise.
    */
  def trySetPageRange(strPageRange: String): Boolean = js.native
}

