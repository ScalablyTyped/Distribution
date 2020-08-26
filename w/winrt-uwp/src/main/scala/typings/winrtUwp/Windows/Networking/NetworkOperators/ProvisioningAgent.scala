package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an agent that provisions connectivity and subscription information with a network provider. */
@js.native
trait ProvisioningAgent extends js.Object {
  /**
    * Retrieves cost and plan information associated with the mobile broadband profile.
    * @param mediaType The media type that the profile belongs to.
    * @param profileName The name of the profile that the cost will be applied to.
    * @return The profile.
    */
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): ProvisionedProfile = js.native
  /**
    * Provisions a device for network connectivity asynchronously, based on the supplied XML document.
    * @param provisioningXmlDocument An instance of CarrierControlSchema that contains the network connectivity provisioning information.
    * @return An asynchronous handler to start the provisioning attempt and track its completion.
    */
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IPromiseWithIAsyncOperation[ProvisionFromXmlDocumentResults] = js.native
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
  implicit class ProvisioningAgentOps[Self <: ProvisioningAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetProvisionedProfile(value: (ProfileMediaType, String) => ProvisionedProfile): Self = this.set("getProvisionedProfile", js.Any.fromFunction2(value))
    @scala.inline
    def setProvisionFromXmlDocumentAsync(value: String => IPromiseWithIAsyncOperation[ProvisionFromXmlDocumentResults]): Self = this.set("provisionFromXmlDocumentAsync", js.Any.fromFunction1(value))
  }
  
}

