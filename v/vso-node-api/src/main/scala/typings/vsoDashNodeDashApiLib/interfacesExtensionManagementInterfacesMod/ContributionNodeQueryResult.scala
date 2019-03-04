package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionNodeQueryResult extends js.Object {
  /**
    * Map of contribution ids to corresponding node.
    */
  var nodes: org.scalablytyped.runtime.StringDictionary[ClientContributionNode]
  /**
    * Map of provder ids to the corresponding provider details object.
    */
  var providerDetails: org.scalablytyped.runtime.StringDictionary[ClientContributionProviderDetails]
}

object ContributionNodeQueryResult {
  @scala.inline
  def apply(
    nodes: org.scalablytyped.runtime.StringDictionary[ClientContributionNode],
    providerDetails: org.scalablytyped.runtime.StringDictionary[ClientContributionProviderDetails]
  ): ContributionNodeQueryResult = {
    val __obj = js.Dynamic.literal(nodes = nodes, providerDetails = providerDetails)
  
    __obj.asInstanceOf[ContributionNodeQueryResult]
  }
}

