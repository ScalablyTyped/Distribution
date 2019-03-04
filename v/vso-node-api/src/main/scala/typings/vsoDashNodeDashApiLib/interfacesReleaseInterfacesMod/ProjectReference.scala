package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  /**
    * Gets the unique identifier of this field.
    */
  var id: java.lang.String
  /**
    * Gets name of project.
    */
  var name: java.lang.String
}

object ProjectReference {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): ProjectReference = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[ProjectReference]
  }
}

