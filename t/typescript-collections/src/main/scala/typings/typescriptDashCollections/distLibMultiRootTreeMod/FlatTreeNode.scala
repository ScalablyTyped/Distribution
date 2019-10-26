package typings.typescriptDashCollections.distLibMultiRootTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatTreeNode extends js.Object {
  var childrenCount: Double
  var hasParent: Boolean
  var id: String
  var level: Double
}

object FlatTreeNode {
  @scala.inline
  def apply(childrenCount: Double, hasParent: Boolean, id: String, level: Double): FlatTreeNode = {
    val __obj = js.Dynamic.literal(childrenCount = childrenCount, hasParent = hasParent, id = id, level = level)
  
    __obj.asInstanceOf[FlatTreeNode]
  }
}

