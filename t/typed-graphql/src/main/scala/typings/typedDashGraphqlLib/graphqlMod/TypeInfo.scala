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

