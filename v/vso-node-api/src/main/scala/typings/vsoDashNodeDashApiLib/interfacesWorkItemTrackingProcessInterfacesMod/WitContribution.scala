package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

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
  var inputs: ScalablyTyped.runtime.StringDictionary[js.Any]
  /**
       * A value indicating if the contribution should be show on deleted workItem.
       */
  var showOnDeletedWorkItem: scala.Boolean
}

