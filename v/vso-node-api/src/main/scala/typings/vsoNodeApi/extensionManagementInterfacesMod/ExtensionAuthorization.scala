package typings.vsoNodeApi.extensionManagementInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuthorization]
  }
}

