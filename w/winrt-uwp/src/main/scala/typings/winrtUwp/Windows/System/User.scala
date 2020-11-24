package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a user. */
@js.native
trait User extends js.Object {
  
  /** Gets the authentication status of the user. */
  var authenticationStatus: UserAuthenticationStatus = js.native
  
  /**
    * Gets a user's picture asynchronously.
    * @param desiredSize The desired size of the user's picture to return.
    * @return When this method completes, it returns the user's picture.
    */
  def getPictureAsync(desiredSize: UserPictureSize): IPromiseWithIAsyncOperation[IRandomAccessStreamReference] = js.native
  
  /**
    * Gets properties for the user.
    * @param values The properties to get. Use the KnownUserProperties class to obtain property names.
    * @return When this method completes, it returns the requested properties. If a property is missing or unavailable, it is reported as an empty string.
    */
  def getPropertiesAsync(values: IVectorView[String]): IPromiseWithIAsyncOperation[IPropertySet] = js.native
  
  /**
    * Gets a property for the user. Use the KnownUserProperties class to obtain property names.
    * @param value The property to get.
    * @return When this method completes, it returns the requested property. If the property is missing or unavailable, an empty string is returned.
    */
  def getPropertyAsync(value: String): IPromiseWithIAsyncOperation[_] = js.native
  
  /** Gets the user's non-roamable id. */
  var nonRoamableId: String = js.native
  
  /** Gets the user type. */
  var `type`: UserType = js.native
}
object User {
  
  @scala.inline
  def apply(
    authenticationStatus: UserAuthenticationStatus,
    getPictureAsync: UserPictureSize => IPromiseWithIAsyncOperation[IRandomAccessStreamReference],
    getPropertiesAsync: IVectorView[String] => IPromiseWithIAsyncOperation[IPropertySet],
    getPropertyAsync: String => IPromiseWithIAsyncOperation[_],
    nonRoamableId: String,
    `type`: UserType
  ): User = {
    val __obj = js.Dynamic.literal(authenticationStatus = authenticationStatus.asInstanceOf[js.Any], getPictureAsync = js.Any.fromFunction1(getPictureAsync), getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), getPropertyAsync = js.Any.fromFunction1(getPropertyAsync), nonRoamableId = nonRoamableId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationStatus(value: UserAuthenticationStatus): Self = this.set("authenticationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPictureAsync(value: UserPictureSize => IPromiseWithIAsyncOperation[IRandomAccessStreamReference]): Self = this.set("getPictureAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPropertiesAsync(value: IVectorView[String] => IPromiseWithIAsyncOperation[IPropertySet]): Self = this.set("getPropertiesAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPropertyAsync(value: String => IPromiseWithIAsyncOperation[_]): Self = this.set("getPropertyAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNonRoamableId(value: String): Self = this.set("nonRoamableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UserType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
