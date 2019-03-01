package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefinitionNameAscending extends js.Object {
  var definitionNameAscending: scala.Double
  var definitionNameDescending: scala.Double
  var lastModifiedAscending: scala.Double
  var lastModifiedDescending: scala.Double
  var none: scala.Double
}

object Anon_DefinitionNameAscending {
  @scala.inline
  def apply(
    definitionNameAscending: scala.Double,
    definitionNameDescending: scala.Double,
    lastModifiedAscending: scala.Double,
    lastModifiedDescending: scala.Double,
    none: scala.Double
  ): Anon_DefinitionNameAscending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitionNameAscending")(definitionNameAscending)
    __obj.updateDynamic("definitionNameDescending")(definitionNameDescending)
    __obj.updateDynamic("lastModifiedAscending")(lastModifiedAscending)
    __obj.updateDynamic("lastModifiedDescending")(lastModifiedDescending)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_DefinitionNameAscending]
  }
}

