package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionShare extends js.Object {
  var id: String
  var name: String
  var `type`: String
}

object ExtensionShare {
  @scala.inline
  def apply(id: String, name: String, `type`: String): ExtensionShare = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionShare]
  }
}

