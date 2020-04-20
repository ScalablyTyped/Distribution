package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTree extends js.Object {
  var none: Double
  var tree: Double
  var workItem: Double
  var workItemLink: Double
  var workItemTypeExtension: Double
}

object AnonTree {
  @scala.inline
  def apply(none: Double, tree: Double, workItem: Double, workItemLink: Double, workItemTypeExtension: Double): AnonTree = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any], workItemTypeExtension = workItemTypeExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTree]
  }
}

