package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an agent that provisions connectivity and subscription information with a network provider. */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
/** Creates a new instance of a ProvisioningAgent . */
class ProvisioningAgent ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisioningAgent {
  /**
    * Retrieves cost and plan information associated with the mobile broadband profile.
    * @param mediaType The media type that the profile belongs to.
    * @param profileName The name of the profile that the cost will be applied to.
    * @return The profile.
    */
  /* CompleteClass */
  override def getProvisionedProfile(
    mediaType: typings.winrtUwp.Windows.Networking.NetworkOperators.ProfileMediaType,
    profileName: String
  ): typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisionedProfile = js.native
  /**
    * Provisions a device for network connectivity asynchronously, based on the supplied XML document.
    * @param provisioningXmlDocument An instance of CarrierControlSchema that contains the network connectivity provisioning information.
    * @return An asynchronous handler to start the provisioning attempt and track its completion.
    */
  /* CompleteClass */
  override def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults
  ] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
object ProvisioningAgent extends js.Object {
  /**
    * Creates a provisioning agent for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the provisioning agent.
    * @return The provisioning agent for the mobile device associated with the supplied network account ID.
    */
  def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisioningAgent = js.native
}

