package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationTextType extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationTextType")
@js.native
object SyndicationTextType extends js.Object {
  @js.native
  sealed trait html extends SyndicationTextType
  
  @js.native
  sealed trait text extends SyndicationTextType
  
  @js.native
  sealed trait xhtml extends SyndicationTextType
  
  /* 1 */ val html: typings.winrt.Windows.Web.Syndication.SyndicationTextType.html with Double = js.native
  /* 0 */ val text: typings.winrt.Windows.Web.Syndication.SyndicationTextType.text with Double = js.native
  /* 2 */ val xhtml: typings.winrt.Windows.Web.Syndication.SyndicationTextType.xhtml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationTextType with Double] = js.native
}

