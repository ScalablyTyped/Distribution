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
    val __obj = js.Dynamic.literal(ignoreConstraints = ignoreConstraints, includeAll = includeAll, includeChildren = includeChildren, includeSelf = includeSelf, includeSubTree = includeSubTree, none = none)
  
    __obj.asInstanceOf[Anon_IgnoreConstraints]
  }
}

