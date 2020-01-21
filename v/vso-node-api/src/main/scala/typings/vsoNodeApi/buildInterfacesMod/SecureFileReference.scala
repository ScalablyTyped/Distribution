package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureFileReference extends ResourceReference {
  /**
    * The ID of the secure file.
    */
  var id: String
}

object SecureFileReference {
  @scala.inline
  def apply(alias: String, id: String): SecureFileReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecureFileReference]
  }
}

