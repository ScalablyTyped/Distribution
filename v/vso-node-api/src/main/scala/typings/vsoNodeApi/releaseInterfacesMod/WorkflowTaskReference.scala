package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskReference extends js.Object {
  var id: String
  var name: String
  var version: String
}

object WorkflowTaskReference {
  @scala.inline
  def apply(id: String, name: String, version: String): WorkflowTaskReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTaskReference]
  }
}

