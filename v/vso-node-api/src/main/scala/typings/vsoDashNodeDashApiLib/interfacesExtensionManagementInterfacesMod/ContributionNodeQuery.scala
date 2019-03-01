package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionNodeQuery extends js.Object {
  /**
    * The contribution ids of the nodes to find.
    */
  var contributionIds: js.Array[java.lang.String]
  /**
    * Indicator if contribution provider details should be included in the result.
    */
  var includeProviderDetails: scala.Boolean
  /**
    * Query options tpo be used when fetching ContributionNodes
    */
  var queryOptions: ContributionQueryOptions
}

object ContributionNodeQuery {
  @scala.inline
  def apply(
    contributionIds: js.Array[java.lang.String],
    includeProviderDetails: scala.Boolean,
    queryOptions: ContributionQueryOptions
  ): ContributionNodeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contributionIds")(contributionIds)
    __obj.updateDynamic("includeProviderDetails")(includeProviderDetails)
    __obj.updateDynamic("queryOptions")(queryOptions)
    __obj.asInstanceOf[ContributionNodeQuery]
  }
}

