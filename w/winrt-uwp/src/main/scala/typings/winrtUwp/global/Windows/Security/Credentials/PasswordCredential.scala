package typings.winrtUwp.global.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the password credential store. */
@JSGlobal("Windows.Security.Credentials.PasswordCredential")
@js.native
/** Creates and initializes a new, empty instance of the PasswordCredential object. */
class PasswordCredential ()
  extends typings.winrtUwp.Windows.Security.Credentials.PasswordCredential {
  /**
    * Creates and initializes a new instance of the PasswordCredential object that contains the provided credential data.
    * @param resource The resource for which the credentials are used.
    * @param userName The user name that must be present in the credentials.
    * @param password The password for the created credentials.
    */
  def this(resource: String, userName: String, password: String) = this()
  /** Gets or sets the password string of the credential. */
  /* CompleteClass */
  override var password: String = js.native
  /** This API is intended for internal use only should not be used in your code. */
  /* CompleteClass */
  override var properties: IPropertySet = js.native
  /** Gets or sets the resource of the credential. */
  /* CompleteClass */
  override var resource: String = js.native
  /** Gets or sets the user name of the credential. */
  /* CompleteClass */
  override var userName: String = js.native
  /** Populates the password for the credential. After the operation returns successfully, you can get the password from the Password property. */
  /* CompleteClass */
  override def retrievePassword(): Unit = js.native
}

