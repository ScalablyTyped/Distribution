package typings.tabris.mod

import typings.tabris.tabrisStrings.declined
import typings.tabris.tabrisStrings.denied
import typings.tabris.tabrisStrings.granted
import typings.tabris.tabrisStrings.rejected
import typings.tabris.tabrisStrings.undetermined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Permission")
@js.native
/**
  * Allows to request runtime permissions which are required to access certain device features. Trying to
  * access a Tabris.js API without a required permission will throw an `Error`.
  * A permission can be either a category (supported on Android and iOS) or a specific Android permission
  * name.
  * See the [permissions documentation](../permissions.md) for full details on how to handle runtime
  * permissions.
  */
/* private */ open class Permission_ () extends NativeObject {
  
  /**
    * Checks the authorization status for a given set of permissions.
    * Since an app permission can change during the apps lifecycle or when it is changed in the app
    * settings, it is recommended to check the permissions status before making API calls that require a
    * granted permission.
    * @param permissions A list of permissions to get the authorization status for.
    */
  def getAuthorizationStatus(permissions: String*): String = js.native
  
  /**
    * Checks if any of the given permissions allow to request authorization. A permission is regarded as
    * allowed to authorize when its status is either `'undetermined'` or `'declined'`.
    * @param permissions A list of permissions to check if authorization is possible.
    */
  def isAuthorizationPossible(permissions: String*): Boolean = js.native
  
  /**
    * Checks whether the given set of permissions is authorized. A set of permissions is regarded as
    * authorized when the status of all permissions is `'granted'`.
    * @param permissions A list of permissions to check its authorization status.
    */
  def isAuthorized(permissions: String*): Boolean = js.native
  
  /**
    * Request authorization for a set of permissions.
    * If any of the permissions allow to request authorization, the method call will prompt the user to
    * grant the permission and returns the result in the resolved promise. If the status can not be
    * changed, the current status is returned by the resolved promise.
    * @param permissions A list of permissions to request authorization for.
    */
  def requestAuthorization(permissions: String*): js.Promise[undetermined | granted | declined | denied | rejected] = js.native
  
  /**
    * Tries to authorize access to the given permissions, either by already holding the permissions or by
    * requesting authorization for the given permissions. When the result is `'granted'` the `onAuthorized`
    * callback will be invoked. If any other state is determined the `onUnauthorized` callback will be
    * invoked. In case of an `Error` the `onError` callback will be invoked.
    * @param permissions An individual permission or a list of permissions to gain authorization for.
    * @param onAuthorized A callback to be invoked if the desired permissions could be granted. The permissions will have the status `'granted`'.
    * @param onUnauthorized A callback to be invoked when the desired permissions could not be granted.
    * @param onError A callback to be invoked if the request failed.
    */
  def withAuthorization(
    permissions: String,
    onAuthorized: js.Function0[Any],
    onUnauthorized: js.Function0[Any],
    onError: js.Function1[/* error */ js.Error, Any]
  ): Unit = js.native
  def withAuthorization(
    permissions: js.Array[String],
    onAuthorized: js.Function0[Any],
    onUnauthorized: js.Function0[Any],
    onError: js.Function1[/* error */ js.Error, Any]
  ): Unit = js.native
}
