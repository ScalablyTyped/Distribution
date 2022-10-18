package typings.winrtUwp.global.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages the document source for app printing. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.HtmlPrintDocumentSource")
@js.native
open class HtmlPrintDocumentSource ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.HtmlPrintDocumentSource {
  
  /** Gets and sets the bottom margin of the document source. */
  /* CompleteClass */
  var bottomMargin: Double = js.native
  
  /** Performs app-defined tasks that are associated with freeing, releasing, or resetting resources that were allocated for the document source. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Gets and sets the content of the document source to print. */
  /* CompleteClass */
  var content: typings.winrtUwp.Windows.UI.WebUI.PrintContent = js.native
  
  /** Gets and sets a value that controls whether header and footer are enabled in the document source. */
  /* CompleteClass */
  var enableHeaderFooter: Boolean = js.native
  
  /** Gets and sets the left margin of the document source. */
  /* CompleteClass */
  var leftMargin: Double = js.native
  
  /** Gets the range of pages that prints. */
  /* CompleteClass */
  var pageRange: String = js.native
  
  /** Gets and sets the size of the document source by percentage. */
  /* CompleteClass */
  var percentScale: Double = js.native
  
  /** Gets and sets the right margin of the document source. */
  /* CompleteClass */
  var rightMargin: Double = js.native
  
  /** Gets and sets a value that controls whether content shrinks to fit the document source. */
  /* CompleteClass */
  var shrinkToFit: Boolean = js.native
  
  /** Gets and sets the top margin of the document source. */
  /* CompleteClass */
  var topMargin: Double = js.native
  
  /**
    * Tries to set the page range of the document source.
    * @param strPageRange The page range to set.
    * @return A Boolean value that indicates whether trySetPageRange set the page range in strPageRange. TRUE indicates the page range was set and FALSE otherwise.
    */
  /* CompleteClass */
  override def trySetPageRange(strPageRange: String): Boolean = js.native
}
