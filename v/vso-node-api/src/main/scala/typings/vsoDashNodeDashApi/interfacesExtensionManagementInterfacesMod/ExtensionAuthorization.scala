package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionAuthorization extends js.Object {
  var id: String
  var scopes: js.Array[String]
}

object ExtensionAuthorization {
  @scala.inline
  def apply(id: String, scopes: js.Array[String]): ExtensionAuthorization = {
    val __obj = js.Dynamic.literal(id = id, scopes = scopes)
  
    __obj.asInstanceOf[ExtensionAuthorization]
  }
}

