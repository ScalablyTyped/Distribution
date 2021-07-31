package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an agent that provisions connectivity and subscription information with a network provider. */
trait ProvisioningAgent extends StObject {
  
  /**
    * Retrieves cost and plan information associated with the mobile broadband profile.
    * @param mediaType The media type that the profile belongs to.
    * @param profileName The name of the profile that the cost will be applied to.
    * @return The profile.
    */
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): ProvisionedProfile
  
  /**
    * Provisions a device for network connectivity asynchronously, based on the supplied XML document.
    * @param provisioningXmlDocument An instance of CarrierControlSchema that contains the network connectivity provisioning information.
    * @return An asynchronous handler to start the provisioning attempt and track its completion.
    */
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IPromiseWithIAsyncOperation[ProvisionFromXmlDocumentResults]
}
object ProvisioningAgent {
  
  @scala.inline
  def apply(
    getProvisionedProfile: (ProfileMediaType, String) => ProvisionedProfile,
    provisionFromXmlDocumentAsync: String => IPromiseWithIAsyncOperation[ProvisionFromXmlDocumentResults]
  ): ProvisioningAgent = {
    val __obj = js.Dynamic.literal(getProvisionedProfile = js.Any.fromFunction2(getProvisionedProfile), provisionFromXmlDocumentAsync = js.Any.fromFunction1(provisionFromXmlDocumentAsync))
    __obj.asInstanceOf[ProvisioningAgent]
  }
  
  @scala.inline
  implicit class ProvisioningAgentMutableBuilder[Self <: ProvisioningAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetProvisionedProfile(value: (ProfileMediaType, String) => ProvisionedProfile): Self = StObject.set(x, "getProvisionedProfile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProvisionFromXmlDocumentAsync(value: String => IPromiseWithIAsyncOperation[ProvisionFromXmlDocumentResults]): Self = StObject.set(x, "provisionFromXmlDocumentAsync", js.Any.fromFunction1(value))
  }
}
