package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionShare extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var `type`: java.lang.String
}

object ExtensionShare {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, `type`: java.lang.String): ExtensionShare = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExtensionShare]
  }
}

