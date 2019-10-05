package typings.umbraco.umbraco.resources

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.currentUserResource
  * @description Used for read/updates for the currently logged in user
  *
  *
  **/
trait ICurrentUserResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.currentUserResource#changePassword
    * @methodOf umbraco.resources.currentUserResource
    *
    * @description
    * Changes the current users password
    *
    * @returns {Promise} resourcePromise object containing the user array.
    *
    */
  def changePassword(changePasswordArgs: js.Any): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.currentUserResource#getMembershipProviderConfig
    * @methodOf umbraco.resources.currentUserResource
    *
    * @description
    * Gets the configuration of the user membership provider which is used to configure the change password form
    */
  def getMembershipProviderConfig(): js.Any
}

object ICurrentUserResource {
  @scala.inline
  def apply(changePassword: js.Any => IPromise[IResourcePromise], getMembershipProviderConfig: () => js.Any): ICurrentUserResource = {
    val __obj = js.Dynamic.literal(changePassword = js.Any.fromFunction1(changePassword), getMembershipProviderConfig = js.Any.fromFunction0(getMembershipProviderConfig))
  
    __obj.asInstanceOf[ICurrentUserResource]
  }
}

