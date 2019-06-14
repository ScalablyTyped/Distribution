package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

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
  sealed trait allPages
    extends winrtDashUwpLib.WindowsNs.UINs.WebUINs.PrintContent
  
  /** Print the current page. */
  @js.native
  sealed trait currentPage
    extends winrtDashUwpLib.WindowsNs.UINs.WebUINs.PrintContent
  
  /** Print the current selection of pages. */
  @js.native
  sealed trait currentSelection
    extends winrtDashUwpLib.WindowsNs.UINs.WebUINs.PrintContent
  
  /** Print a custom page range. */
  @js.native
  sealed trait customPageRange
    extends winrtDashUwpLib.WindowsNs.UINs.WebUINs.PrintContent
  
  /* 0 */ val allPages: allPages with scala.Double = js.native
  /* 1 */ val currentPage: currentPage with scala.Double = js.native
  /* 3 */ val currentSelection: currentSelection with scala.Double = js.native
  /* 2 */ val customPageRange: customPageRange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.WebUINs.PrintContent with scala.Double] = js.native
}

