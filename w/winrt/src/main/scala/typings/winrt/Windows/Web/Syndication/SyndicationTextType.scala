package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
