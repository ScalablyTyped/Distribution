package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationTextType with Double] = js.native
  /* 1 */ @js.native
  object html extends TopLevel[html with Double]
  
  /* 0 */ @js.native
  object text extends TopLevel[text with Double]
  
  /* 2 */ @js.native
  object xhtml extends TopLevel[xhtml with Double]
  
}

