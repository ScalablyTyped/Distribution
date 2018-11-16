package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkItemTypeCategory extends WorkItemTrackingResource {
  /**
       * Gets or sets the default type of the work item.
       */
  var defaultWorkItemType: WorkItemTypeReference
  /**
       * The name of the category.
       */
  var name: java.lang.String
  /**
       * The reference name of the category.
       */
  var referenceName: java.lang.String
  /**
       * The work item types that belond to the category.
       */
  var workItemTypes: js.Array[WorkItemTypeReference]
}

