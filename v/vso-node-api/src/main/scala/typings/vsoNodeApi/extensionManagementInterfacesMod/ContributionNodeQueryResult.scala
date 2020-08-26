package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributionNodeQueryResult extends js.Object {
  /**
    * Map of contribution ids to corresponding node.
    */
  var nodes: StringDictionary[ClientContributionNode] = js.native
  /**
    * Map of provder ids to the corresponding provider details object.
    */
  var providerDetails: StringDictionary[ClientContributionProviderDetails] = js.native
}

object ContributionNodeQueryResult {
  @scala.inline
  def apply(
    nodes: StringDictionary[ClientContributionNode],
    providerDetails: StringDictionary[ClientContributionProviderDetails]
  ): ContributionNodeQueryResult = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], providerDetails = providerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionNodeQueryResult]
  }
  @scala.inline
  implicit class ContributionNodeQueryResultOps[Self <: ContributionNodeQueryResult] (val x: Self) extends AnyVal {
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
    def setNodes(value: StringDictionary[ClientContributionNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderDetails(value: StringDictionary[ClientContributionProviderDetails]): Self = this.set("providerDetails", value.asInstanceOf[js.Any])
  }
  
}

