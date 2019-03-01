package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionPolicy extends js.Object {
  /**
    * Permissions on 'Install' operation
    */
  var install: ExtensionPolicyFlags
  /**
    * Permission on 'Request' operation
    */
  var request: ExtensionPolicyFlags
}

object ExtensionPolicy {
  @scala.inline
  def apply(install: ExtensionPolicyFlags, request: ExtensionPolicyFlags): ExtensionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("install")(install)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[ExtensionPolicy]
  }
}

