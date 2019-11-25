package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitContribution extends js.Object {
  /**
    * The id for the contribution.
    */
  var contributionId: String
  /**
    * The height for the contribution.
    */
  var height: Double
  /**
    * A dictionary holding key value pairs for contribution inputs.
    */
  var inputs: StringDictionary[js.Any]
  /**
    * A value indicating if the contribution should be show on deleted workItem.
    */
  var showOnDeletedWorkItem: Boolean
}

object WitContribution {
  @scala.inline
  def apply(
    contributionId: String,
    height: Double,
    inputs: StringDictionary[js.Any],
    showOnDeletedWorkItem: Boolean
  ): WitContribution = {
    val __obj = js.Dynamic.literal(contributionId = contributionId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], showOnDeletedWorkItem = showOnDeletedWorkItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WitContribution]
  }
}

