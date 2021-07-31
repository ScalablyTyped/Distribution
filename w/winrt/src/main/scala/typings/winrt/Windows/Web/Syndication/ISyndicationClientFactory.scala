package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationClientFactory extends StObject {
  
  def createSyndicationClient(serverCredential: PasswordCredential): SyndicationClient
}
object ISyndicationClientFactory {
  
  @scala.inline
  def apply(createSyndicationClient: PasswordCredential => SyndicationClient): ISyndicationClientFactory = {
    val __obj = js.Dynamic.literal(createSyndicationClient = js.Any.fromFunction1(createSyndicationClient))
    __obj.asInstanceOf[ISyndicationClientFactory]
  }
  
  @scala.inline
  implicit class ISyndicationClientFactoryMutableBuilder[Self <: ISyndicationClientFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateSyndicationClient(value: PasswordCredential => SyndicationClient): Self = StObject.set(x, "createSyndicationClient", js.Any.fromFunction1(value))
  }
}
