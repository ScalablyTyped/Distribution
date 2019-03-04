package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BehaviorModel extends js.Object {
  /**
    * Is the behavior abstract (i.e. can not be associated with any work item type)
    */
  var `abstract`: scala.Boolean
  /**
    * Color
    */
  var color: java.lang.String
  /**
    * Description
    */
  var description: java.lang.String
  /**
    * Behavior Id
    */
  var id: java.lang.String
  /**
    * Parent behavior reference
    */
  var inherits: WorkItemBehaviorReference
  /**
    * Behavior Name
    */
  var name: java.lang.String
  /**
    * Is the behavior overrides a behavior from system process
    */
  var overridden: scala.Boolean
  /**
    * Rank
    */
  var rank: scala.Double
  /**
    * Url of the behavior
    */
  var url: java.lang.String
}

object BehaviorModel {
  @scala.inline
  def apply(
    `abstract`: scala.Boolean,
    color: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    inherits: WorkItemBehaviorReference,
    name: java.lang.String,
    overridden: scala.Boolean,
    rank: scala.Double,
    url: java.lang.String
  ): BehaviorModel = {
    val __obj = js.Dynamic.literal(color = color, description = description, id = id, inherits = inherits, name = name, overridden = overridden, rank = rank, url = url)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.asInstanceOf[BehaviorModel]
  }
}

