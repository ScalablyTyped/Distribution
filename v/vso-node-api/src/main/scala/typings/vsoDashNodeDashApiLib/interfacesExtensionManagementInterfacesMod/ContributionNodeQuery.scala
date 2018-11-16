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

