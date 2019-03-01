package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskReference extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var version: java.lang.String
}

object WorkflowTaskReference {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, version: java.lang.String): WorkflowTaskReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WorkflowTaskReference]
  }
}

