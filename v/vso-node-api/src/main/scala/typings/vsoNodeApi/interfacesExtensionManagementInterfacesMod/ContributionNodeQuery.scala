package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributionNodeQuery extends StObject {
  
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
  
  inline def apply(
    contributionIds: js.Array[String],
    includeProviderDetails: Boolean,
    queryOptions: ContributionQueryOptions
  ): ContributionNodeQuery = {
    val __obj = js.Dynamic.literal(contributionIds = contributionIds.asInstanceOf[js.Any], includeProviderDetails = includeProviderDetails.asInstanceOf[js.Any], queryOptions = queryOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionNodeQuery]
  }
  
  extension [Self <: ContributionNodeQuery](x: Self) {
    
    inline def setContributionIds(value: js.Array[String]): Self = StObject.set(x, "contributionIds", value.asInstanceOf[js.Any])
    
    inline def setContributionIdsVarargs(value: String*): Self = StObject.set(x, "contributionIds", js.Array(value*))
    
    inline def setIncludeProviderDetails(value: Boolean): Self = StObject.set(x, "includeProviderDetails", value.asInstanceOf[js.Any])
    
    inline def setQueryOptions(value: ContributionQueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
  }
}
