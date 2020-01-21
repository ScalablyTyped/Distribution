package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BehaviorCreateModel extends js.Object {
  /**
    * Color
    */
  var color: String
  /**
    * Parent behavior id
    */
  var inherits: String
  /**
    * Name of the behavior
    */
  var name: String
}

object BehaviorCreateModel {
  @scala.inline
  def apply(color: String, inherits: String, name: String): BehaviorCreateModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BehaviorCreateModel]
  }
}

