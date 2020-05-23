package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user. */
@JSGlobal("Windows.System.User")
@js.native
abstract class User ()
  extends typings.winrtUwp.Windows.System.User {
  /** Gets the authentication status of the user. */
  /* CompleteClass */
  override var authenticationStatus: typings.winrtUwp.Windows.System.UserAuthenticationStatus = js.native
  /** Gets the user's non-roamable id. */
  /* CompleteClass */
  override var nonRoamableId: String = js.native
  /** Gets the user type. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.System.UserType = js.native
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
  override def getPropertyAsync(value: String): IPromiseWithIAsyncOperation[_] = js.native
}

/* static members */
@JSGlobal("Windows.System.User")
@js.native
object User extends js.Object {
  /**
    * Creates a UserWatcher which enumerates users and raises events when the collection of users changes or when a user’s authentication state changes.
    * @return A UserWatcher which enumerates users and raises events when the collection of users changes.
    */
  def createWatcher(): typings.winrtUwp.Windows.System.UserWatcher = js.native
  /**
    * Finds all users asynchronously.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Finds all users of a given type asynchronously.
    * @param type The type of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(`type`: typings.winrtUwp.Windows.System.UserType): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Finds all users of a given type and authentication status asynchronously.
    * @param type The type of users to find.
    * @param status The authentication status of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(
    `type`: typings.winrtUwp.Windows.System.UserType,
    status: typings.winrtUwp.Windows.System.UserAuthenticationStatus
  ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a user with a given Id.
    * @param nonRoamableId The Id of the user to get.
    * @return The user with the given Id.
    */
  def getFromId(nonRoamableId: String): typings.winrtUwp.Windows.System.User = js.native
}

