package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreConstraints extends js.Object {
  var ignoreConstraints: Double
  var includeAll: Double
  var includeChildren: Double
  var includeSelf: Double
  var includeSubTree: Double
  var none: Double
}

object Anon_IgnoreConstraints {
  @scala.inline
  def apply(
    ignoreConstraints: Double,
    includeAll: Double,
    includeChildren: Double,
    includeSelf: Double,
    includeSubTree: Double,
    none: Double
  ): Anon_IgnoreConstraints = {
    val __obj = js.Dynamic.literal(ignoreConstraints = ignoreConstraints.asInstanceOf[js.Any], includeAll = includeAll.asInstanceOf[js.Any], includeChildren = includeChildren.asInstanceOf[js.Any], includeSelf = includeSelf.asInstanceOf[js.Any], includeSubTree = includeSubTree.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IgnoreConstraints]
  }
}

