package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeInheritedDefinitionsOnly extends js.Object {
  var includeInheritedDefinitionsOnly: scala.Double
  var includeLastUserAccess: scala.Double
  var includeNonInheritedDefinitionsOnly: scala.Double
  var includeServices: scala.Double
  var none: scala.Double
}

object IncludeInheritedDefinitionsOnly {
  @scala.inline
  def apply(
    includeInheritedDefinitionsOnly: scala.Double,
    includeLastUserAccess: scala.Double,
    includeNonInheritedDefinitionsOnly: scala.Double,
    includeServices: scala.Double,
    none: scala.Double
  ): IncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(includeInheritedDefinitionsOnly = includeInheritedDefinitionsOnly.asInstanceOf[js.Any], includeLastUserAccess = includeLastUserAccess.asInstanceOf[js.Any], includeNonInheritedDefinitionsOnly = includeNonInheritedDefinitionsOnly.asInstanceOf[js.Any], includeServices = includeServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeInheritedDefinitionsOnly]
  }
}

