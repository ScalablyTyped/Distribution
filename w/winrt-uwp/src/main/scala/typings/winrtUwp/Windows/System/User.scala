package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a user. */
trait User extends StObject {
  
  /** Gets the authentication status of the user. */
  var authenticationStatus: UserAuthenticationStatus
  
  /**
    * Gets a user's picture asynchronously.
    * @param desiredSize The desired size of the user's picture to return.
    * @return When this method completes, it returns the user's picture.
    */
  def getPictureAsync(desiredSize: UserPictureSize): IPromiseWithIAsyncOperation[IRandomAccessStreamReference]
  
  /**
    * Gets properties for the user.
    * @param values The properties to get. Use the KnownUserProperties class to obtain property names.
    * @return When this method completes, it returns the requested properties. If a property is missing or unavailable, it is reported as an empty string.
    */
  def getPropertiesAsync(values: IVectorView[String]): IPromiseWithIAsyncOperation[IPropertySet]
  
  /**
    * Gets a property for the user. Use the KnownUserProperties class to obtain property names.
    * @param value The property to get.
    * @return When this method completes, it returns the requested property. If the property is missing or unavailable, an empty string is returned.
    */
  def getPropertyAsync(value: String): IPromiseWithIAsyncOperation[Any]
  
  /** Gets the user's non-roamable id. */
  var nonRoamableId: String
  
  /** Gets the user type. */
  var `type`: UserType
}
object User {
  
  inline def apply(
    authenticationStatus: UserAuthenticationStatus,
    getPictureAsync: UserPictureSize => IPromiseWithIAsyncOperation[IRandomAccessStreamReference],
    getPropertiesAsync: IVectorView[String] => IPromiseWithIAsyncOperation[IPropertySet],
    getPropertyAsync: String => IPromiseWithIAsyncOperation[Any],
    nonRoamableId: String,
    `type`: UserType
  ): User = {
    val __obj = js.Dynamic.literal(authenticationStatus = authenticationStatus.asInstanceOf[js.Any], getPictureAsync = js.Any.fromFunction1(getPictureAsync), getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), getPropertyAsync = js.Any.fromFunction1(getPropertyAsync), nonRoamableId = nonRoamableId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationStatus(value: UserAuthenticationStatus): Self = StObject.set(x, "authenticationStatus", value.asInstanceOf[js.Any])
    
    inline def setGetPictureAsync(value: UserPictureSize => IPromiseWithIAsyncOperation[IRandomAccessStreamReference]): Self = StObject.set(x, "getPictureAsync", js.Any.fromFunction1(value))
    
    inline def setGetPropertiesAsync(value: IVectorView[String] => IPromiseWithIAsyncOperation[IPropertySet]): Self = StObject.set(x, "getPropertiesAsync", js.Any.fromFunction1(value))
    
    inline def setGetPropertyAsync(value: String => IPromiseWithIAsyncOperation[Any]): Self = StObject.set(x, "getPropertyAsync", js.Any.fromFunction1(value))
    
    inline def setNonRoamableId(value: String): Self = StObject.set(x, "nonRoamableId", value.asInstanceOf[js.Any])
    
    inline def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
