package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BehaviorReplaceModel extends js.Object {
  /**
    * Color
    */
  var color: java.lang.String
  /**
    * Behavior Name
    */
  var name: java.lang.String
}

object BehaviorReplaceModel {
  @scala.inline
  def apply(color: java.lang.String, name: java.lang.String): BehaviorReplaceModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BehaviorReplaceModel]
  }
}

