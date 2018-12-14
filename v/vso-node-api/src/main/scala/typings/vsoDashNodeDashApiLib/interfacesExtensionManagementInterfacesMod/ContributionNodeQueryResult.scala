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

