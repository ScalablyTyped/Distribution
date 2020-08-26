package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  var clauses: js.Array[FilterClause] = js.native
  var filter: String = js.native
  var isEnabled: String = js.native
  var name: String = js.native
  var settings: attribute = js.native
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
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClausesVarargs(value: FilterClause*): Self = this.set("clauses", js.Array(value :_*))
    @scala.inline
    def setClauses(value: js.Array[FilterClause]): Self = this.set("clauses", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: String): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: attribute): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

