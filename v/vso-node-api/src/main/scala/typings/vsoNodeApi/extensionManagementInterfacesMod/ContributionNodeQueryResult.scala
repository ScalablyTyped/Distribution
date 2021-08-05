package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributionNodeQueryResult extends StObject {
  
  /**
    * Map of contribution ids to corresponding node.
    */
  var nodes: StringDictionary[ClientContributionNode]
  
  /**
    * Map of provder ids to the corresponding provider details object.
    */
  var providerDetails: StringDictionary[ClientContributionProviderDetails]
}
object ContributionNodeQueryResult {
  
  inline def apply(
    nodes: StringDictionary[ClientContributionNode],
    providerDetails: StringDictionary[ClientContributionProviderDetails]
  ): ContributionNodeQueryResult = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], providerDetails = providerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionNodeQueryResult]
  }
  
  extension [Self <: ContributionNodeQueryResult](x: Self) {
    
    inline def setNodes(value: StringDictionary[ClientContributionNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setProviderDetails(value: StringDictionary[ClientContributionProviderDetails]): Self = StObject.set(x, "providerDetails", value.asInstanceOf[js.Any])
  }
}
