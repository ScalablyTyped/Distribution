package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionFilterModel extends js.Object {
  /**
    * Flat list of clauses in this subscription
    */
  var clauses: js.Array[ExpressionFilterClause] = js.native
  /**
    * Grouping of clauses in the subscription
    */
  var groups: js.Array[ExpressionFilterGroup] = js.native
  /**
    * Max depth of the Subscription tree
    */
  var maxGroupLevel: Double = js.native
}

object ExpressionFilterModel {
  @scala.inline
  def apply(
    clauses: js.Array[ExpressionFilterClause],
    groups: js.Array[ExpressionFilterGroup],
    maxGroupLevel: Double
  ): ExpressionFilterModel = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], maxGroupLevel = maxGroupLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilterModel]
  }
  @scala.inline
  implicit class ExpressionFilterModelOps[Self <: ExpressionFilterModel] (val x: Self) extends AnyVal {
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
    def setClausesVarargs(value: ExpressionFilterClause*): Self = this.set("clauses", js.Array(value :_*))
    @scala.inline
    def setClauses(value: js.Array[ExpressionFilterClause]): Self = this.set("clauses", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: ExpressionFilterGroup*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[ExpressionFilterGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxGroupLevel(value: Double): Self = this.set("maxGroupLevel", value.asInstanceOf[js.Any])
  }
  
}

