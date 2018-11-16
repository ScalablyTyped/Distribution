package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkItemTypeModel extends js.Object {
  var behaviors: js.Array[WorkItemTypeBehavior]
  var `class`: WorkItemTypeClass
  var color: java.lang.String
  var description: java.lang.String
  var icon: java.lang.String
  var id: java.lang.String
  /**
       * Parent WIT Id/Internal ReferenceName that it inherits from
       */
  var inherits: java.lang.String
  var isDisabled: scala.Boolean
  var layout: FormLayout
  var name: java.lang.String
  var states: js.Array[WorkItemStateResultModel]
  var url: java.lang.String
}

