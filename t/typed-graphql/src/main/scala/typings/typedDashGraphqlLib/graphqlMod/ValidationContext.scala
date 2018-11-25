package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValidationContext extends js.Object {
  def getArgument(): GraphQLArgument
  def getDirective(): GraphQLDirective
  def getDocument(): Document
  def getErrors(): js.Array[GraphQLError]
  def getFieldDef(): GraphQLFieldDefinition
  def getFragment(name: java.lang.String): FragmentDefinition
  def getFragmentSpreads(node: SelectionSet): js.Array[FragmentSpread]
  def getInputType(): GraphQLInputType
  def getParentType(): GraphQLCompositeType
  def getRecursiveVariableUsages(operation: OperationDefinition): js.Array[VariableUsage]
  def getRecursivelyReferencedFragments(operation: OperationDefinition): js.Array[FragmentDefinition]
  def getSchema(): GraphQLSchema
  def getType(): GraphQLOutputType
  def getVariableUsages(node: HasSelectionSet): js.Array[VariableUsage]
  def reportError(error: GraphQLError): scala.Unit
}

