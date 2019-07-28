package typings.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-federatedcredentialrequestoptions}
  */
trait FederatedCredentialRequestOptions extends js.Object {
  /**
    * An array of protocol identifiers.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredentialrequestoptions-protocols}
    */
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array of federation identifiers.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredentialrequestoptions-providers}
    */
  var providers: js.UndefOr[js.Array[String]] = js.undefined
}

object FederatedCredentialRequestOptions {
  @scala.inline
  def apply(protocols: js.Array[String] = null, providers: js.Array[String] = null): FederatedCredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[FederatedCredentialRequestOptions]
  }
}

