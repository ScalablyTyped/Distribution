package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionNodeQuery extends js.Object {
  /**
    * The contribution ids of the nodes to find.
    */
  var contributionIds: js.Array[String]
  /**
    * Indicator if contribution provider details should be included in the result.
    */
  var includeProviderDetails: Boolean
  /**
    * Query options tpo be used when fetching ContributionNodes
    */
  var queryOptions: ContributionQueryOptions
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
}

