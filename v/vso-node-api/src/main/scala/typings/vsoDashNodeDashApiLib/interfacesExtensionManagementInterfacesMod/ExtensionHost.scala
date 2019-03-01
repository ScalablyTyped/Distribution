package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionHost extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
}

object ExtensionHost {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): ExtensionHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ExtensionHost]
  }
}

