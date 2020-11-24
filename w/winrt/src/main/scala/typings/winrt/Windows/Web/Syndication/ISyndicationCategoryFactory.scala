package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationCategoryFactory extends js.Object {
  
  def createSyndicationCategory(term: String): SyndicationCategory = js.native
  def createSyndicationCategory(term: String, scheme: String, label: String): SyndicationCategory = js.native
}
