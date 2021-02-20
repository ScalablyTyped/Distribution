package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContributionNodeQuery extends StObject {
  
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
  implicit class ContributionNodeQueryMutableBuilder[Self <: ContributionNodeQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContributionIds(value: js.Array[String]): Self = StObject.set(x, "contributionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributionIdsVarargs(value: String*): Self = StObject.set(x, "contributionIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludeProviderDetails(value: Boolean): Self = StObject.set(x, "includeProviderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryOptions(value: ContributionQueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
  }
}
