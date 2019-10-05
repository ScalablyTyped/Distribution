package typings.winrtDashUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintContent extends js.Object

/** Specifies the content that HtmlPrintDocumentSource.content prints. */
@JSGlobal("Windows.UI.WebUI.PrintContent")
@js.native
object PrintContent extends js.Object {
  /** Print all pages. */
  @js.native
  sealed trait allPages extends PrintContent
  
  /** Print the current page. */
  @js.native
  sealed trait currentPage extends PrintContent
  
  /** Print the current selection of pages. */
  @js.native
  sealed trait currentSelection extends PrintContent
  
  /** Print a custom page range. */
  @js.native
  sealed trait customPageRange extends PrintContent
  
  /* 0 */ val allPages: typings.winrtDashUwp.Windows.UI.WebUI.PrintContent.allPages with Double = js.native
  /* 1 */ val currentPage: typings.winrtDashUwp.Windows.UI.WebUI.PrintContent.currentPage with Double = js.native
  /* 3 */ val currentSelection: typings.winrtDashUwp.Windows.UI.WebUI.PrintContent.currentSelection with Double = js.native
  /* 2 */ val customPageRange: typings.winrtDashUwp.Windows.UI.WebUI.PrintContent.customPageRange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintContent with Double] = js.native
}

