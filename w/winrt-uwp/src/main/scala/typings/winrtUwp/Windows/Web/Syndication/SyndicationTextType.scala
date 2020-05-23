package typings.winrtUwp.Windows.Web.Syndication

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
  
}

