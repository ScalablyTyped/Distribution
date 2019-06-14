package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationTextType extends js.Object

/** Specifies the text types supported for syndication content. */
@JSGlobal("Windows.Web.Syndication.SyndicationTextType")
@js.native
object SyndicationTextType extends js.Object {
  /** HTML (escaped markup) */
  @js.native
  sealed trait html
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType
  
  /** Plain text */
  @js.native
  sealed trait text
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType
  
  /** XML (not escaped) */
  @js.native
  sealed trait xhtml
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType
  
  /* 1 */ val html: html with scala.Double = js.native
  /* 0 */ val text: text with scala.Double = js.native
  /* 2 */ val xhtml: xhtml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType with scala.Double
  ] = js.native
}

