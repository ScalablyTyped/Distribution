package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskReference extends js.Object {
  /**
    * The ID of the task definition.
    */
  var id: String
  /**
    * The name of the task definition.
    */
  var name: String
  /**
    * The version of the task definition.
    */
  var version: String
}

object TaskReference {
  @scala.inline
  def apply(id: String, name: String, version: String): TaskReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskReference]
  }
}

