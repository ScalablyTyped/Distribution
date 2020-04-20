package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  /**
    * Gets the unique identifier of this field.
    */
  var id: String
  /**
    * Gets name of project.
    */
  var name: String
}

object ProjectReference {
  @scala.inline
  def apply(id: String, name: String): ProjectReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
}

