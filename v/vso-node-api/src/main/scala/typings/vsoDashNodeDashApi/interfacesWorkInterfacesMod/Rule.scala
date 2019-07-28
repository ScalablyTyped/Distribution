package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var clauses: js.Array[FilterClause]
  var filter: String
  var isEnabled: String
  var name: String
  var settings: attribute
}

object Rule {
  @scala.inline
  def apply(
    clauses: js.Array[FilterClause],
    filter: String,
    isEnabled: String,
    name: String,
    settings: attribute
  ): Rule = {
    val __obj = js.Dynamic.literal(clauses = clauses, filter = filter, isEnabled = isEnabled, name = name, settings = settings)
  
    __obj.asInstanceOf[Rule]
  }
}

