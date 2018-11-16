package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientContributionNode extends js.Object {
  /**
       * List of ids for contributions which are children to the current contribution.
       */
  var children: js.Array[java.lang.String]
  /**
       * Contribution associated with this node.
       */
  var contribution: ClientContribution
  /**
       * List of ids for contributions which are parents to the current contribution.
       */
  var parents: js.Array[java.lang.String]
}

