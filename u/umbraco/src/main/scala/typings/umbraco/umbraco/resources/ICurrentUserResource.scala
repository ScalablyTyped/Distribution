package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
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
@js.native
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
  def changePassword(changePasswordArgs: js.Any): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.currentUserResource#getMembershipProviderConfig
    * @methodOf umbraco.resources.currentUserResource
    *
    * @description
    * Gets the configuration of the user membership provider which is used to configure the change password form
    */
  def getMembershipProviderConfig(): js.Any = js.native
}

object ICurrentUserResource {
  @scala.inline
  def apply(changePassword: js.Any => IPromise[IResourcePromise], getMembershipProviderConfig: () => js.Any): ICurrentUserResource = {
    val __obj = js.Dynamic.literal(changePassword = js.Any.fromFunction1(changePassword), getMembershipProviderConfig = js.Any.fromFunction0(getMembershipProviderConfig))
    __obj.asInstanceOf[ICurrentUserResource]
  }
  @scala.inline
  implicit class ICurrentUserResourceOps[Self <: ICurrentUserResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangePassword(value: js.Any => IPromise[IResourcePromise]): Self = this.set("changePassword", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMembershipProviderConfig(value: () => js.Any): Self = this.set("getMembershipProviderConfig", js.Any.fromFunction0(value))
  }
  
}

