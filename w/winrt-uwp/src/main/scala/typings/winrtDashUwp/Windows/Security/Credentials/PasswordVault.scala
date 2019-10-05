package typings.winrtDashUwp.Windows.Security.Credentials

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Credential Locker of credentials. The contents of the locker are specific to the app or service. Apps and services don't have access to credentials associated with other apps or services. */
@JSGlobal("Windows.Security.Credentials.PasswordVault")
@js.native
/** Creates and initializes a new instance of the PasswordVault object. */
class PasswordVault () extends js.Object {
  /**
    * Adds a credential to the Credential Locker.
    * @param credential The credential to be added.
    */
  def add(credential: PasswordCredential): Unit = js.native
  /**
    * Searches the Credential Locker for credentials matching the resource specified.
    * @param resource The resource to be searched for.
    * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
    */
  def findAllByResource(resource: String): IVectorView[PasswordCredential] = js.native
  /**
    * Searches the Credential Locker for credentials that match the user name specified.
    * @param userName The user name to be searched for.
    * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
    */
  def findAllByUserName(userName: String): IVectorView[PasswordCredential] = js.native
  /**
    * Removes a credential from the Credential Locker.
    * @param credential The credential to be removed.
    */
  def remove(credential: PasswordCredential): Unit = js.native
  /**
    * Reads a credential from the Credential Locker.
    * @param resource The resource for which the credential is used.
    * @param userName The user name that must be present in the credential.
    * @return The returned credential that contains all the data.
    */
  def retrieve(resource: String, userName: String): PasswordCredential = js.native
  /**
    * Retrieves all of the credentials stored in the Credential Locker.
    * @return When this method returns, contains an IVectorView output of credential objects that match the search criteria. This output is a snapshot and not dynamic. If the results are used for updating or deleting credentials, those changes won't be reflected in the previous output.
    */
  def retrieveAll(): IVectorView[PasswordCredential] = js.native
}

