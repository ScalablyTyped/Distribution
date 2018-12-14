package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WitContribution extends js.Object {
  /**
       * The id for the contribution.
       */
  var contributionId: java.lang.String
  /**
       * The height for the contribution.
       */
  var height: scala.Double
  /**
       * A dictionary holding key value pairs for contribution inputs.
       */
  var inputs: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
       * A value indicating if the contribution should be show on deleted workItem.
       */
  var showOnDeletedWorkItem: scala.Boolean
}

