package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoneTree extends js.Object {
  var none: scala.Double
  var tree: scala.Double
  var workItem: scala.Double
  var workItemLink: scala.Double
  var workItemTypeExtension: scala.Double
}

object Anon_NoneTree {
  @scala.inline
  def apply(
    none: scala.Double,
    tree: scala.Double,
    workItem: scala.Double,
    workItemLink: scala.Double,
    workItemTypeExtension: scala.Double
  ): Anon_NoneTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("tree")(tree)
    __obj.updateDynamic("workItem")(workItem)
    __obj.updateDynamic("workItemLink")(workItemLink)
    __obj.updateDynamic("workItemTypeExtension")(workItemTypeExtension)
    __obj.asInstanceOf[Anon_NoneTree]
  }
}

