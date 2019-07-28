package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BehaviorModel extends js.Object {
  /**
    * Is the behavior abstract (i.e. can not be associated with any work item type)
    */
  var `abstract`: Boolean
  /**
    * Color
    */
  var color: String
  /**
    * Description
    */
  var description: String
  /**
    * Behavior Id
    */
  var id: String
  /**
    * Parent behavior reference
    */
  var inherits: WorkItemBehaviorReference
  /**
    * Behavior Name
    */
  var name: String
  /**
    * Is the behavior overrides a behavior from system process
    */
  var overridden: Boolean
  /**
    * Rank
    */
  var rank: Double
  /**
    * Url of the behavior
    */
  var url: String
}

object BehaviorModel {
  @scala.inline
  def apply(
    `abstract`: Boolean,
    color: String,
    description: String,
    id: String,
    inherits: WorkItemBehaviorReference,
    name: String,
    overridden: Boolean,
    rank: Double,
    url: String
  ): BehaviorModel = {
    val __obj = js.Dynamic.literal(color = color, description = description, id = id, inherits = inherits, name = name, overridden = overridden, rank = rank, url = url)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.asInstanceOf[BehaviorModel]
  }
}

