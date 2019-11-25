package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  /**
    * Description of the project
    */
  var description: String
  /**
    * The ID of the project
    */
  var id: String
  /**
    * Name of the project
    */
  var name: String
  /**
    * Url of the project
    */
  var url: String
}

object ProjectReference {
  @scala.inline
  def apply(description: String, id: String, name: String, url: String): ProjectReference = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectReference]
  }
}

