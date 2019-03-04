package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utilities/Typeinfo.js
trait TypeInfo extends js.Object {
  def enter(node: Node): scala.Unit
  def getArgument(): GraphQLArgument
  def getDirective(): GraphQLDirective
  def getFieldDef(): GraphQLFieldDefinition
  def getInputType(): GraphQLInputType
  def getParentType(): GraphQLCompositeType
  def getType(): GraphQLOutputType
  def leave(node: Node): scala.Unit
}

object TypeInfo {
  @scala.inline
  def apply(
    enter: js.Function1[Node, scala.Unit],
    getArgument: js.Function0[GraphQLArgument],
    getDirective: js.Function0[GraphQLDirective],
    getFieldDef: js.Function0[GraphQLFieldDefinition],
    getInputType: js.Function0[GraphQLInputType],
    getParentType: js.Function0[GraphQLCompositeType],
    getType: js.Function0[GraphQLOutputType],
    leave: js.Function1[Node, scala.Unit]
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(enter = enter, getArgument = getArgument, getDirective = getDirective, getFieldDef = getFieldDef, getInputType = getInputType, getParentType = getParentType, getType = getType, leave = leave)
  
    __obj.asInstanceOf[TypeInfo]
  }
}

