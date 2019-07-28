package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableUsage extends js.Object {
  var node: Variable
  var `type`: GraphQLInputType
}

object VariableUsage {
  @scala.inline
  def apply(node: Variable, `type`: GraphQLInputType): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VariableUsage]
  }
}

