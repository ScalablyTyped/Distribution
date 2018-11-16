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

