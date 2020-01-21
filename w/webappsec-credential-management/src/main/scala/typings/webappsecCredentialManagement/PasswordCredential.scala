package typings.webappsecCredentialManagement

import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
  */
@JSGlobal("PasswordCredential")
@js.native
class PasswordCredential protected ()
  extends SiteBoundCredential
     with CredentialType {
  def this(data: HTMLFormElement) = this()
  /**
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordcredential-data}
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordcredential}
    */
  def this(data: PasswordCredentialData) = this()
  /**
    * If the developer wishes to specify additional data to insert into the
    * request body when submitting the credential information to a remote
    * endpoint, they can do so by assigning a FormData or URLSearchParams
    * object to this attribute. The credential information will be
    * mixed into the object to produce the body. The value is {@code null}
    * unless otherwise specified.
    */
  var additionalData: CredentialBodyType | Null = js.native
  /**
    * Represents the name which will be used for the ID field when submitting
    * the PasswordCredential to a remote endpoint via {@code fetch()}. It
    * defaults to "username", but can be overridden by a developer to match
    * whatever the backend service expects.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-idname}
    */
  var idName: String = js.native
  /**
    * The plain-text password. Returned for implementation of the 08/04/2017
    * Working Draft of Credential Management, not returned before this.
    *
    * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
    */
  val password: js.UndefOr[String] = js.native
  /**
    * Represents the name which will be used for the ID field when submitting
    * the PasswordCredential to a remote endpoint via fetch(). It defaults to
    * "password", but can be overridden by a developer to match whatever the
    * backend service expects.
    *
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordname}
    */
  var passwordName: String = js.native
  @JSName("type")
  val type_PasswordCredential: typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.password = js.native
}

