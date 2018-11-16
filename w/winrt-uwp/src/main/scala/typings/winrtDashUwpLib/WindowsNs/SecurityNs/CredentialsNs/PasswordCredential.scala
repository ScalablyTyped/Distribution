package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the password credential store. */
@JSGlobal("Windows.Security.Credentials.PasswordCredential")
@js.native
class PasswordCredential () extends js.Object {
  /**
                   * Creates and initializes a new instance of the PasswordCredential object that contains the provided credential data.
                   * @param resource The resource for which the credentials are used.
                   * @param userName The user name that must be present in the credentials.
                   * @param password The password for the created credentials.
                   */
  def this(resource: java.lang.String, userName: java.lang.String, password: java.lang.String) = this()
  /** Gets or sets the password string of the credential. */
  var password: java.lang.String = js.native
  /** This API is intended for internal use only should not be used in your code. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets the resource of the credential. */
  var resource: java.lang.String = js.native
  /** Gets or sets the user name of the credential. */
  var userName: java.lang.String = js.native
  /** Populates the password for the credential. After the operation returns successfully, you can get the password from the Password property. */
  def retrievePassword(): scala.Unit = js.native
}

