package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WitContribution extends js.Object {
  /**
    * The id for the contribution.
    */
  var contributionId: String = js.native
  /**
    * The height for the contribution.
    */
  var height: Double = js.native
  /**
    * A dictionary holding key value pairs for contribution inputs.
    */
  var inputs: StringDictionary[js.Any] = js.native
  /**
    * A value indicating if the contribution should be show on deleted workItem.
    */
  var showOnDeletedWorkItem: Boolean = js.native
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
  @scala.inline
  implicit class WitContributionOps[Self <: WitContribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContributionId(value: String): Self = this.set("contributionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(value: StringDictionary[js.Any]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowOnDeletedWorkItem(value: Boolean): Self = this.set("showOnDeletedWorkItem", value.asInstanceOf[js.Any])
  }
  
}

