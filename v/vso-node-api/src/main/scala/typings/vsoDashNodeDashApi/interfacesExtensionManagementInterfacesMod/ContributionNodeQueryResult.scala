package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionNodeQueryResult extends js.Object {
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
  @scala.inline
  def apply(
    nodes: StringDictionary[ClientContributionNode],
    providerDetails: StringDictionary[ClientContributionProviderDetails]
  ): ContributionNodeQueryResult = {
    val __obj = js.Dynamic.literal(nodes = nodes, providerDetails = providerDetails)
  
    __obj.asInstanceOf[ContributionNodeQueryResult]
  }
}

