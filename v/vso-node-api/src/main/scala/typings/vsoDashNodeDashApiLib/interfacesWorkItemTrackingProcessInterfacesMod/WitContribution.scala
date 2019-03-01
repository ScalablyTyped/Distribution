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
  var inputs: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A value indicating if the contribution should be show on deleted workItem.
    */
  var showOnDeletedWorkItem: scala.Boolean
}

object WitContribution {
  @scala.inline
  def apply(
    contributionId: java.lang.String,
    height: scala.Double,
    inputs: org.scalablytyped.runtime.StringDictionary[js.Any],
    showOnDeletedWorkItem: scala.Boolean
  ): WitContribution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contributionId")(contributionId)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("showOnDeletedWorkItem")(showOnDeletedWorkItem)
    __obj.asInstanceOf[WitContribution]
  }
}

