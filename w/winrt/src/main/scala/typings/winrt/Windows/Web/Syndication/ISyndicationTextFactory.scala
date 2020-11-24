package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationTextFactory extends js.Object {
  
  def createSyndicationText(text: String): SyndicationText = js.native
  def createSyndicationText(text: String, `type`: SyndicationTextType): SyndicationText = js.native
}
