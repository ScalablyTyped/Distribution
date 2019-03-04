package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  /**
    * Description of the project
    */
  var description: java.lang.String
  /**
    * The ID of the project
    */
  var id: java.lang.String
  /**
    * Name of the project
    */
  var name: java.lang.String
  /**
    * Url of the project
    */
  var url: java.lang.String
}

object ProjectReference {
  @scala.inline
  def apply(description: java.lang.String, id: java.lang.String, name: java.lang.String, url: java.lang.String): ProjectReference = {
    val __obj = js.Dynamic.literal(description = description, id = id, name = name, url = url)
  
    __obj.asInstanceOf[ProjectReference]
  }
}

