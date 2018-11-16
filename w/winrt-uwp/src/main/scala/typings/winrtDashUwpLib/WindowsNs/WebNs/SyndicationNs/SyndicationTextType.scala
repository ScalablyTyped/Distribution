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
  
  val html: html with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val xhtml: xhtml with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType with java.lang.String
  ] = js.native
}

