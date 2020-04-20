package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeInheritedDefinitionsOnly extends js.Object {
  var includeInheritedDefinitionsOnly: Double
  var includeLastUserAccess: Double
  var includeNonInheritedDefinitionsOnly: Double
  var includeServices: Double
  var none: Double
}

object AnonIncludeInheritedDefinitionsOnly {
  @scala.inline
  def apply(
    includeInheritedDefinitionsOnly: Double,
    includeLastUserAccess: Double,
    includeNonInheritedDefinitionsOnly: Double,
    includeServices: Double,
    none: Double
  ): AnonIncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(includeInheritedDefinitionsOnly = includeInheritedDefinitionsOnly.asInstanceOf[js.Any], includeLastUserAccess = includeLastUserAccess.asInstanceOf[js.Any], includeNonInheritedDefinitionsOnly = includeNonInheritedDefinitionsOnly.asInstanceOf[js.Any], includeServices = includeServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeInheritedDefinitionsOnly]
  }
}

