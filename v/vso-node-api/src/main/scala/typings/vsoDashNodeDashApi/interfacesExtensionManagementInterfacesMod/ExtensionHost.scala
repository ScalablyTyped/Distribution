package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionHost extends js.Object {
  var id: String
  var name: String
}

object ExtensionHost {
  @scala.inline
  def apply(id: String, name: String): ExtensionHost = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[ExtensionHost]
  }
}

