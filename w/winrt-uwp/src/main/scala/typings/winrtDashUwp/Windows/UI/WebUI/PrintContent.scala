package typings.winrtDashUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintContent with Double] = js.native
  /* 0 */ @js.native
  object allPages extends TopLevel[allPages with Double]
  
  /* 1 */ @js.native
  object currentPage extends TopLevel[currentPage with Double]
  
  /* 3 */ @js.native
  object currentSelection extends TopLevel[currentSelection with Double]
  
  /* 2 */ @js.native
  object customPageRange extends TopLevel[customPageRange with Double]
  
}

