package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreConstraints extends js.Object {
  var ignoreConstraints: Double
  var includeAll: Double
  var includeChildren: Double
  var includeSelf: Double
  var includeSubTree: Double
  var none: Double
}

object AnonIgnoreConstraints {
  @scala.inline
  def apply(
    ignoreConstraints: Double,
    includeAll: Double,
    includeChildren: Double,
    includeSelf: Double,
    includeSubTree: Double,
    none: Double
  ): AnonIgnoreConstraints = {
    val __obj = js.Dynamic.literal(ignoreConstraints = ignoreConstraints.asInstanceOf[js.Any], includeAll = includeAll.asInstanceOf[js.Any], includeChildren = includeChildren.asInstanceOf[js.Any], includeSelf = includeSelf.asInstanceOf[js.Any], includeSubTree = includeSubTree.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIgnoreConstraints]
  }
}

