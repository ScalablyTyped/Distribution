package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BehaviorCreateModel extends js.Object {
  /**
    * Color
    */
  var color: java.lang.String
  /**
    * Parent behavior id
    */
  var inherits: java.lang.String
  /**
    * Name of the behavior
    */
  var name: java.lang.String
}

object BehaviorCreateModel {
  @scala.inline
  def apply(color: java.lang.String, inherits: java.lang.String, name: java.lang.String): BehaviorCreateModel = {
    val __obj = js.Dynamic.literal(color = color, inherits = inherits, name = name)
  
    __obj.asInstanceOf[BehaviorCreateModel]
  }
}

