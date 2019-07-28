package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContributionNode extends js.Object {
  /**
    * List of ids for contributions which are children to the current contribution.
    */
  var children: js.Array[String]
  /**
    * Contribution associated with this node.
    */
  var contribution: ClientContribution
  /**
    * List of ids for contributions which are parents to the current contribution.
    */
  var parents: js.Array[String]
}

object ClientContributionNode {
  @scala.inline
  def apply(children: js.Array[String], contribution: ClientContribution, parents: js.Array[String]): ClientContributionNode = {
    val __obj = js.Dynamic.literal(children = children, contribution = contribution, parents = parents)
  
    __obj.asInstanceOf[ClientContributionNode]
  }
}

