package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BehaviorReplaceModel extends js.Object {
  /**
    * Color
    */
  var color: String
  /**
    * Behavior Name
    */
  var name: String
}

object BehaviorReplaceModel {
  @scala.inline
  def apply(color: String, name: String): BehaviorReplaceModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BehaviorReplaceModel]
  }
}

