package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tree extends js.Object {
  var none: scala.Double
  var tree: scala.Double
  var workItem: scala.Double
  var workItemLink: scala.Double
  var workItemTypeExtension: scala.Double
}

object Tree {
  @scala.inline
  def apply(
    none: scala.Double,
    tree: scala.Double,
    workItem: scala.Double,
    workItemLink: scala.Double,
    workItemTypeExtension: scala.Double
  ): Tree = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any], workItemTypeExtension = workItemTypeExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
}

