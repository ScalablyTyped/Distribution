package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureFileReference extends ResourceReference {
  /**
    * The ID of the secure file.
    */
  var id: java.lang.String
}

object SecureFileReference {
  @scala.inline
  def apply(alias: java.lang.String, id: java.lang.String): SecureFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[SecureFileReference]
  }
}

