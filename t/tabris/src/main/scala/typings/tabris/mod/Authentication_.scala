package typings.tabris.mod

import typings.tabris.anon.AllowCredentials
import typings.tabris.anon.Message
import typings.tabris.anon.`2`
import typings.tabris.tabrisStrings.face
import typings.tabris.tabrisStrings.fingerprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Authentication")
@js.native
/**
  * Allows to request authentication from the user. The means of authentication depends on the device
  * configuration. For example, the authentication could be performed via credentials like pin or
  * password or via a biometric authentication like fingerprint or face.
  */
/* private */ open class Authentication_ () extends NativeObject {
  
  /**
    * Request the user to authenticate using the device default mechanism. The resolved promise returns a
    * result object with `'status'` and optionally `'message'`. The `'status'` Informs about the result of
    * the authentication operation. In case of non-authentication flow errors like a incorrectly configured
    * client, the promise is rejected.
    * @param options A set of options to apply when authenticating.
    */
  def authenticate(): js.Promise[Message] = js.native
  def authenticate(options: AllowCredentials): js.Promise[Message] = js.native
  
  /**
    * The biometric authentication mechanisms available on the device. Currently supported values are
    * `'fingerprint'` and `'face'`.
    */
  val availableBiometrics: js.Array[fingerprint | face] = js.native
  
  /**
    * Checks whether the device has any authentication mechanism configured. If the device does not require
    * any authentication `false` is returned.
    * @param options A set of options to apply when authenticating.
    */
  def canAuthenticate(): Boolean = js.native
  def canAuthenticate(options: `2`): Boolean = js.native
  
  /**
    * Closes a potentially open authentication ui.
    */
  def cancel(): Unit = js.native
  
  /**
    * Fired when the [*availableBiometrics*](#availableBiometrics) property has changed.
    */
  var onAvailableBiometricsChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.availableBiometrics] = js.native
}
