package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a user. */
@JSGlobal("Windows.System.User")
@js.native
abstract class User ()
  extends typings.winrtUwp.Windows.System.User
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
