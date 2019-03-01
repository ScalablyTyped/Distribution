package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var clauses: js.Array[FilterClause]
  var filter: java.lang.String
  var isEnabled: java.lang.String
  var name: java.lang.String
  var settings: attribute
}

object Rule {
  @scala.inline
  def apply(
    clauses: js.Array[FilterClause],
    filter: java.lang.String,
    isEnabled: java.lang.String,
    name: java.lang.String,
    settings: attribute
  ): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clauses")(clauses)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Rule]
  }
}

