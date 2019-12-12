package typings.winrtDashUwp.Windows.Web.Syndication

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Web.Syndication.SyndicationTextType.html
import typings.winrtDashUwp.Windows.Web.Syndication.SyndicationTextType.text
import typings.winrtDashUwp.Windows.Web.Syndication.SyndicationTextType.xhtml
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
  sealed trait html extends SyndicationTextType
  
  /** Plain text */
  @js.native
  sealed trait text extends SyndicationTextType
  
  /** XML (not escaped) */
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

