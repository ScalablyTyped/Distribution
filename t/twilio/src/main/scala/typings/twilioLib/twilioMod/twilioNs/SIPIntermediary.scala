package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SIPIntermediary extends js.Object {
  var credentialLists: CredentialListResource
  var domains: DomainResource
  var ipAccessControlLists: IPAccessControlListResource
}

object SIPIntermediary {
  @scala.inline
  def apply(
    credentialLists: CredentialListResource,
    domains: DomainResource,
    ipAccessControlLists: IPAccessControlListResource
  ): SIPIntermediary = {
    val __obj = js.Dynamic.literal(credentialLists = credentialLists, domains = domains, ipAccessControlLists = ipAccessControlLists)
  
    __obj.asInstanceOf[SIPIntermediary]
  }
}

