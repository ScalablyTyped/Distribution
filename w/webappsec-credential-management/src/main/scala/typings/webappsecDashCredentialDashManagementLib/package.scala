package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webappsecDashCredentialDashManagementLib {
  /**
    * @see {@link https://www.w3.org/TR/credential-management-1/#typedefdef-credentialbodytype}
    */
  type CredentialBodyType = stdLib.FormData | stdLib.URLSearchParams
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
    */
  type FederatedCredentialInit = FederatedCredentialData
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#typedefdef-passwordcredentialinit}
    */
  type PasswordCredentialInit = PasswordCredentialData | stdLib.HTMLFormElement
  // Type definitions for webauthn
  // Spec: https://w3c.github.io/webauthn/
  /**
    * @see {@link https://w3c.github.io/webauthn/#enumdef-publickeycredentialtype}
    */
  type PublicKeyCredentialType = webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.`public-key`
}
