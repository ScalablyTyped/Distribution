package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeInheritedDefinitionsOnly extends js.Object {
  var includeInheritedDefinitionsOnly: scala.Double
  var includeLastUserAccess: scala.Double
  var includeNonInheritedDefinitionsOnly: scala.Double
  var includeServices: scala.Double
  var none: scala.Double
}

object Anon_IncludeInheritedDefinitionsOnly {
  @scala.inline
  def apply(
    includeInheritedDefinitionsOnly: scala.Double,
    includeLastUserAccess: scala.Double,
    includeNonInheritedDefinitionsOnly: scala.Double,
    includeServices: scala.Double,
    none: scala.Double
  ): Anon_IncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeInheritedDefinitionsOnly")(includeInheritedDefinitionsOnly)
    __obj.updateDynamic("includeLastUserAccess")(includeLastUserAccess)
    __obj.updateDynamic("includeNonInheritedDefinitionsOnly")(includeNonInheritedDefinitionsOnly)
    __obj.updateDynamic("includeServices")(includeServices)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_IncludeInheritedDefinitionsOnly]
  }
}

