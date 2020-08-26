package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableUsage extends js.Object {
  var node: Variable = js.native
  var `type`: GraphQLInputType = js.native
}

object VariableUsage {
  @scala.inline
  def apply(node: Variable, `type`: GraphQLInputType): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUsage]
  }
  @scala.inline
  implicit class VariableUsageOps[Self <: VariableUsage] (val x: Self) extends AnyVal {
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
    def setNode(value: Variable): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GraphQLInputType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

