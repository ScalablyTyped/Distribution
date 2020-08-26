package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributionNodeQuery extends js.Object {
  /**
    * The contribution ids of the nodes to find.
    */
  var contributionIds: js.Array[String] = js.native
  /**
    * Indicator if contribution provider details should be included in the result.
    */
  var includeProviderDetails: Boolean = js.native
  /**
    * Query options tpo be used when fetching ContributionNodes
    */
  var queryOptions: ContributionQueryOptions = js.native
}

object ContributionNodeQuery {
  @scala.inline
  def apply(
    contributionIds: js.Array[String],
    includeProviderDetails: Boolean,
    queryOptions: ContributionQueryOptions
  ): ContributionNodeQuery = {
    val __obj = js.Dynamic.literal(contributionIds = contributionIds.asInstanceOf[js.Any], includeProviderDetails = includeProviderDetails.asInstanceOf[js.Any], queryOptions = queryOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionNodeQuery]
  }
  @scala.inline
  implicit class ContributionNodeQueryOps[Self <: ContributionNodeQuery] (val x: Self) extends AnyVal {
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
    def setContributionIdsVarargs(value: String*): Self = this.set("contributionIds", js.Array(value :_*))
    @scala.inline
    def setContributionIds(value: js.Array[String]): Self = this.set("contributionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeProviderDetails(value: Boolean): Self = this.set("includeProviderDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryOptions(value: ContributionQueryOptions): Self = this.set("queryOptions", value.asInstanceOf[js.Any])
  }
  
}

