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
  
  val html: html with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val xhtml: xhtml with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationTextType with java.lang.String] = js.native
}

