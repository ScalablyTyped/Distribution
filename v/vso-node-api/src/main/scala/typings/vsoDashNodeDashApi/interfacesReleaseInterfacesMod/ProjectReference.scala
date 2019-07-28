package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[ProjectReference]
  }
}

