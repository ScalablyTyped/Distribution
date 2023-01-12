package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProvisioningAgent extends StObject {
  
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): ProvisionedProfile
  
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[ProvisionFromXmlDocumentResults]
}
object IProvisioningAgent {
  
  inline def apply(
    getProvisionedProfile: (ProfileMediaType, String) => ProvisionedProfile,
    provisionFromXmlDocumentAsync: String => IAsyncOperation[ProvisionFromXmlDocumentResults]
  ): IProvisioningAgent = {
    val __obj = js.Dynamic.literal(getProvisionedProfile = js.Any.fromFunction2(getProvisionedProfile), provisionFromXmlDocumentAsync = js.Any.fromFunction1(provisionFromXmlDocumentAsync))
    __obj.asInstanceOf[IProvisioningAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProvisioningAgent] (val x: Self) extends AnyVal {
    
    inline def setGetProvisionedProfile(value: (ProfileMediaType, String) => ProvisionedProfile): Self = StObject.set(x, "getProvisionedProfile", js.Any.fromFunction2(value))
    
    inline def setProvisionFromXmlDocumentAsync(value: String => IAsyncOperation[ProvisionFromXmlDocumentResults]): Self = StObject.set(x, "provisionFromXmlDocumentAsync", js.Any.fromFunction1(value))
  }
}
