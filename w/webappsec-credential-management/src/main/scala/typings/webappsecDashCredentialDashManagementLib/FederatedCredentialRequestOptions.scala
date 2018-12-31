package typings
package webappsecDashCredentialDashManagementLib

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
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of federation identifiers.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredentialrequestoptions-providers}
    */
  var providers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

