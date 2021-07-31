package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationPersonFactory extends StObject {
  
  def createSyndicationPerson(name: String): SyndicationPerson = js.native
  def createSyndicationPerson(name: String, email: String, uri: Uri): SyndicationPerson = js.native
}
