package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id, name = name, version = version)
  
    __obj.asInstanceOf[WorkflowTaskReference]
  }
}

