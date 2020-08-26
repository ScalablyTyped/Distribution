package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientContributionNode extends js.Object {
  /**
    * List of ids for contributions which are children to the current contribution.
    */
  var children: js.Array[String] = js.native
  /**
    * Contribution associated with this node.
    */
  var contribution: ClientContribution = js.native
  /**
    * List of ids for contributions which are parents to the current contribution.
    */
  var parents: js.Array[String] = js.native
}

object ClientContributionNode {
  @scala.inline
  def apply(children: js.Array[String], contribution: ClientContribution, parents: js.Array[String]): ClientContributionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], contribution = contribution.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContributionNode]
  }
  @scala.inline
  implicit class ClientContributionNodeOps[Self <: ClientContributionNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: String*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[String]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setContribution(value: ClientContribution): Self = this.set("contribution", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
  }
  
}

