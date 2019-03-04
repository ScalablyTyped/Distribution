package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionAuthorization extends js.Object {
  var id: java.lang.String
  var scopes: js.Array[java.lang.String]
}

object ExtensionAuthorization {
  @scala.inline
  def apply(id: java.lang.String, scopes: js.Array[java.lang.String]): ExtensionAuthorization = {
    val __obj = js.Dynamic.literal(id = id, scopes = scopes)
  
    __obj.asInstanceOf[ExtensionAuthorization]
  }
}

