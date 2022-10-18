package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a user. */
/* note: abstract class */ @JSGlobal("Windows.System.User")
@js.native
open class User ()
  extends StObject
     with typings.winrtUwp.Windows.System.User {
  
  /** Gets the authentication status of the user. */
  /* CompleteClass */
  var authenticationStatus: typings.winrtUwp.Windows.System.UserAuthenticationStatus = js.native
  
  /**
    * Gets a user's picture asynchronously.
    * @param desiredSize The desired size of the user's picture to return.
    * @return When this method completes, it returns the user's picture.
    */
  /* CompleteClass */
  override def getPictureAsync(desiredSize: typings.winrtUwp.Windows.System.UserPictureSize): IPromiseWithIAsyncOperation[IRandomAccessStreamReference] = js.native
  
  /**
    * Gets properties for the user.
    * @param values The properties to get. Use the KnownUserProperties class to obtain property names.
    * @return When this method completes, it returns the requested properties. If a property is missing or unavailable, it is reported as an empty string.
    */
  /* CompleteClass */
  override def getPropertiesAsync(values: IVectorView[String]): IPromiseWithIAsyncOperation[IPropertySet] = js.native
  
  /**
    * Gets a property for the user. Use the KnownUserProperties class to obtain property names.
    * @param value The property to get.
    * @return When this method completes, it returns the requested property. If the property is missing or unavailable, an empty string is returned.
    */
  /* CompleteClass */
  override def getPropertyAsync(value: String): IPromiseWithIAsyncOperation[Any] = js.native
  
  /** Gets the user's non-roamable id. */
  /* CompleteClass */
  var nonRoamableId: String = js.native
  
  /** Gets the user type. */
  /* CompleteClass */
  var `type`: typings.winrtUwp.Windows.System.UserType = js.native
}
object User {
  
  @JSGlobal("Windows.System.User")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a UserWatcher which enumerates users and raises events when the collection of users changes or when a user’s authentication state changes.
    * @return A UserWatcher which enumerates users and raises events when the collection of users changes.
    */
  /* static member */
  inline def createWatcher(): typings.winrtUwp.Windows.System.UserWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typings.winrtUwp.Windows.System.UserWatcher]
  
  /**
    * Finds all users asynchronously.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  /* static member */
  inline def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  /**
    * Finds all users of a given type asynchronously.
    * @param type The type of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  /* static member */
  inline def findAllAsync(`type`: typings.winrtUwp.Windows.System.UserType): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(`type`.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  /**
    * Finds all users of a given type and authentication status asynchronously.
    * @param type The type of users to find.
    * @param status The authentication status of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  /* static member */
  inline def findAllAsync(
    `type`: typings.winrtUwp.Windows.System.UserType,
    status: typings.winrtUwp.Windows.System.UserAuthenticationStatus
  ): IPromiseWithIAsyncOperation[IVectorView[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(`type`.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  
  /**
    * Gets a user with a given Id.
    * @param nonRoamableId The Id of the user to get.
    * @return The user with the given Id.
    */
  /* static member */
  inline def getFromId(nonRoamableId: String): typings.winrtUwp.Windows.System.User = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromId")(nonRoamableId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.System.User]
}
