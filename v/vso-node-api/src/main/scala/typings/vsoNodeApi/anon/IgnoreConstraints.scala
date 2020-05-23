package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreConstraints extends js.Object {
  var ignoreConstraints: scala.Double
  var includeAll: scala.Double
  var includeChildren: scala.Double
  var includeSelf: scala.Double
  var includeSubTree: scala.Double
  var none: scala.Double
}

object IgnoreConstraints {
  @scala.inline
  def apply(
    ignoreConstraints: scala.Double,
    includeAll: scala.Double,
    includeChildren: scala.Double,
    includeSelf: scala.Double,
    includeSubTree: scala.Double,
    none: scala.Double
  ): IgnoreConstraints = {
    val __obj = js.Dynamic.literal(ignoreConstraints = ignoreConstraints.asInstanceOf[js.Any], includeAll = includeAll.asInstanceOf[js.Any], includeChildren = includeChildren.asInstanceOf[js.Any], includeSelf = includeSelf.asInstanceOf[js.Any], includeSubTree = includeSubTree.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreConstraints]
  }
}

