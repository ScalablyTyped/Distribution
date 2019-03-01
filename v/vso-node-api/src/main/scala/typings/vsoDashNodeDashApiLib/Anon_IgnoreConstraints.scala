package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreConstraints extends js.Object {
  var ignoreConstraints: scala.Double
  var includeAll: scala.Double
  var includeChildren: scala.Double
  var includeSelf: scala.Double
  var includeSubTree: scala.Double
  var none: scala.Double
}

object Anon_IgnoreConstraints {
  @scala.inline
  def apply(
    ignoreConstraints: scala.Double,
    includeAll: scala.Double,
    includeChildren: scala.Double,
    includeSelf: scala.Double,
    includeSubTree: scala.Double,
    none: scala.Double
  ): Anon_IgnoreConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoreConstraints")(ignoreConstraints)
    __obj.updateDynamic("includeAll")(includeAll)
    __obj.updateDynamic("includeChildren")(includeChildren)
    __obj.updateDynamic("includeSelf")(includeSelf)
    __obj.updateDynamic("includeSubTree")(includeSubTree)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_IgnoreConstraints]
  }
}

