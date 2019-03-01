package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryConfiguration extends js.Object {
  /**
    * Name
    */
  var name: java.lang.String
  /**
    * Category Reference Name
    */
  var referenceName: java.lang.String
  /**
    * Work item types for the backlog category
    */
  var workItemTypes: js.Array[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
  ]
}

object CategoryConfiguration {
  @scala.inline
  def apply(
    name: java.lang.String,
    referenceName: java.lang.String,
    workItemTypes: js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
    ]
  ): CategoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("referenceName")(referenceName)
    __obj.updateDynamic("workItemTypes")(workItemTypes)
    __obj.asInstanceOf[CategoryConfiguration]
  }
}

