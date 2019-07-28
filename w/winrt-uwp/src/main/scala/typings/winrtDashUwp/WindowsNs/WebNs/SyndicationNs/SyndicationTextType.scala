package typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs

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
  
  /* 1 */ val html: typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs.SyndicationTextType.html with Double = js.native
  /* 0 */ val text: typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs.SyndicationTextType.text with Double = js.native
  /* 2 */ val xhtml: typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs.SyndicationTextType.xhtml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationTextType with Double] = js.native
}

