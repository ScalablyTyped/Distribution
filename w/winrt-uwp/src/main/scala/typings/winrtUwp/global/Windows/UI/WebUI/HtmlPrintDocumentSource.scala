package typings.winrtUwp.global.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the document source for app printing. */
@JSGlobal("Windows.UI.WebUI.HtmlPrintDocumentSource")
@js.native
abstract class HtmlPrintDocumentSource ()
  extends typings.winrtUwp.Windows.UI.WebUI.HtmlPrintDocumentSource {
  /** Gets and sets the bottom margin of the document source. */
  /* CompleteClass */
  override var bottomMargin: Double = js.native
  /** Gets and sets the content of the document source to print. */
  /* CompleteClass */
  override var content: typings.winrtUwp.Windows.UI.WebUI.PrintContent = js.native
  /** Gets and sets a value that controls whether header and footer are enabled in the document source. */
  /* CompleteClass */
  override var enableHeaderFooter: Boolean = js.native
  /** Gets and sets the left margin of the document source. */
  /* CompleteClass */
  override var leftMargin: Double = js.native
  /** Gets the range of pages that prints. */
  /* CompleteClass */
  override var pageRange: String = js.native
  /** Gets and sets the size of the document source by percentage. */
  /* CompleteClass */
  override var percentScale: Double = js.native
  /** Gets and sets the right margin of the document source. */
  /* CompleteClass */
  override var rightMargin: Double = js.native
  /** Gets and sets a value that controls whether content shrinks to fit the document source. */
  /* CompleteClass */
  override var shrinkToFit: Boolean = js.native
  /** Gets and sets the top margin of the document source. */
  /* CompleteClass */
  override var topMargin: Double = js.native
  /** Performs app-defined tasks that are associated with freeing, releasing, or resetting resources that were allocated for the document source. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Tries to set the page range of the document source.
    * @param strPageRange The page range to set.
    * @return A Boolean value that indicates whether trySetPageRange set the page range in strPageRange. TRUE indicates the page range was set and FALSE otherwise.
    */
  /* CompleteClass */
  override def trySetPageRange(strPageRange: String): Boolean = js.native
}

