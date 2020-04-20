package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utilities/Typeinfo.js
trait TypeInfo extends js.Object {
  def enter(node: Node): Unit
  def getArgument(): GraphQLArgument
  def getDirective(): GraphQLDirective
  def getFieldDef(): GraphQLFieldDefinition
  def getInputType(): GraphQLInputType
  def getParentType(): GraphQLCompositeType
  def getType(): GraphQLOutputType
  def leave(node: Node): Unit
}

object TypeInfo {
  @scala.inline
  def apply(
    enter: Node => Unit,
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getFieldDef: () => GraphQLFieldDefinition,
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getType: () => GraphQLOutputType,
    leave: Node => Unit
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getFieldDef = js.Any.fromFunction0(getFieldDef), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getType = js.Any.fromFunction0(getType), leave = js.Any.fromFunction1(leave))
    __obj.asInstanceOf[TypeInfo]
  }
}

