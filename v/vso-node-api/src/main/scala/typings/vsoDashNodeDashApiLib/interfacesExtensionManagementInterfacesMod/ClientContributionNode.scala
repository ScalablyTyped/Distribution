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

object ClientContributionNode {
  @scala.inline
  def apply(
    children: js.Array[java.lang.String],
    contribution: ClientContribution,
    parents: js.Array[java.lang.String]
  ): ClientContributionNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("contribution")(contribution)
    __obj.updateDynamic("parents")(parents)
    __obj.asInstanceOf[ClientContributionNode]
  }
}

