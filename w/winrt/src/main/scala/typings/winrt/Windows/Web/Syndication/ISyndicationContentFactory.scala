package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationContentFactory extends StObject {
  
  def createSyndicationContent(sourceUri: Uri): SyndicationContent = js.native
  def createSyndicationContent(text: String, `type`: SyndicationTextType): SyndicationContent = js.native
}
