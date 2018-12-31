package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeModel extends js.Object {
  /**
    * Behaviors of the work item type
    */
  var behaviors: js.Array[WorkItemTypeBehavior]
  /**
    * Class of the work item type
    */
  var `class`: WorkItemTypeClass
  /**
    * Color of the work item type
    */
  var color: java.lang.String
  /**
    * Description of the work item type
    */
  var description: java.lang.String
  /**
    * Icon of the work item type
    */
  var icon: java.lang.String
  /**
    * The ID of the work item type
    */
  var id: java.lang.String
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: java.lang.String
  /**
    * Is work item type disabled
    */
  var isDisabled: scala.Boolean
  /**
    * Layout of the work item type
    */
  var layout: FormLayout
  /**
    * Name of the work item type
    */
  var name: java.lang.String
  /**
    * States of the work item type
    */
  var states: js.Array[WorkItemStateResultModel]
  /**
    * Url of the work item type
    */
  var url: java.lang.String
}

