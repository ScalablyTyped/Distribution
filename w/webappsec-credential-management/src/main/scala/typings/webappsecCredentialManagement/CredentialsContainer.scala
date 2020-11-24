package typings.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#credentialscontainer}
  */
@js.native
trait CredentialsContainer extends js.Object {
  
  /**
    * Create a {@link Credential} asynchronously.
    *
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dom-credentialscontainer-create}
    */
  def create(options: CredentialCreationOptions): js.Promise[CredentialType | Null] = js.native
  
  /**
    * Request a credential from the credential manager.
    *
    * @param options
    *     Contains an object filled with type-specific sets of parameters
    *     which will be used to select a particular {@link Credential} to
    *     return.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-credentialscontainer-get}
    */
  def get(): js.Promise[CredentialType | Null] = js.native
  def get(options: CredentialRequestOptions): js.Promise[CredentialType | Null] = js.native
  
  /**
    * Ask the credential manager to require user mediation before returning
    * credentials for the origin in which the method is called. This might be
    * called after a user signs out of a website, for instance, in order to
    * ensure that they are not automatically signed back in next time they
    * visits.
    *
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dom-credentialscontainer-preventsilentaccess}
    */
  def preventSilentAccess(): js.Promise[Unit] = js.native
  
  /**
    * Ask the credential manager to require user mediation before returning
    * credentials for the origin in which the method is called. This might be
    * called after a user signs out of a website, for instance, in order to
    * ensure that they are not automatically signed back in next time they
    * visits.
    *
    * @deprecated Use {@link preventSilentAccess} instead.
    * @see {@link https://www.w3.org/TR/2016/WD-credential-management-1-20160425/#dom-credentialscontainer-requireusermediation}
    */
  def requireUserMediation(): js.Promise[Unit] = js.native
  
  /**
    * Ask the credential manager to store a {@link Credential} for the user.
    * Authors could call this method after a user successfully signs in, or
    * after a successful password change operation.
    *
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-credentialscontainer-store}
    */
  def store(credential: CredentialType): js.Promise[CredentialType] = js.native
}
