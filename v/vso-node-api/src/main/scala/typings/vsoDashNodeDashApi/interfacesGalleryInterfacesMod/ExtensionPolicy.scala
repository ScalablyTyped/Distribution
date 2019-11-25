package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
    val __obj = js.Dynamic.literal(install = install.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionPolicy]
  }
}

