package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationTextType extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationTextType")
@js.native
object SyndicationTextType extends js.Object {
  @js.native
  sealed trait html
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType
  
  @js.native
  sealed trait text
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType
  
  @js.native
  sealed trait xhtml
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType
  
  /* 1 */ val html: html with scala.Double = js.native
  /* 0 */ val text: text with scala.Double = js.native
  /* 2 */ val xhtml: xhtml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType with scala.Double] = js.native
}

