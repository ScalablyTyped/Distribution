package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationContext extends StObject {
  
  def getArgument(): GraphQLArgument
  
  def getDirective(): GraphQLDirective
  
  def getDocument(): Document
  
  def getErrors(): js.Array[GraphQLError]
  
  def getFieldDef(): GraphQLFieldDefinition
  
  def getFragment(name: String): FragmentDefinition
  
  def getFragmentSpreads(node: SelectionSet): js.Array[FragmentSpread]
  
  def getInputType(): GraphQLInputType
  
  def getParentType(): GraphQLCompositeType
  
  def getRecursiveVariableUsages(operation: OperationDefinition): js.Array[VariableUsage]
  
  def getRecursivelyReferencedFragments(operation: OperationDefinition): js.Array[FragmentDefinition]
  
  def getSchema(): GraphQLSchema
  
  def getType(): GraphQLOutputType
  
  def getVariableUsages(node: HasSelectionSet): js.Array[VariableUsage]
  
  def reportError(error: GraphQLError): Unit
}
object ValidationContext {
  
  inline def apply(
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getDocument: () => Document,
    getErrors: () => js.Array[GraphQLError],
    getFieldDef: () => GraphQLFieldDefinition,
    getFragment: String => FragmentDefinition,
    getFragmentSpreads: SelectionSet => js.Array[FragmentSpread],
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getRecursiveVariableUsages: OperationDefinition => js.Array[VariableUsage],
    getRecursivelyReferencedFragments: OperationDefinition => js.Array[FragmentDefinition],
    getSchema: () => GraphQLSchema,
    getType: () => GraphQLOutputType,
    getVariableUsages: HasSelectionSet => js.Array[VariableUsage],
    reportError: GraphQLError => Unit
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getDocument = js.Any.fromFunction0(getDocument), getErrors = js.Any.fromFunction0(getErrors), getFieldDef = js.Any.fromFunction0(getFieldDef), getFragment = js.Any.fromFunction1(getFragment), getFragmentSpreads = js.Any.fromFunction1(getFragmentSpreads), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getRecursiveVariableUsages = js.Any.fromFunction1(getRecursiveVariableUsages), getRecursivelyReferencedFragments = js.Any.fromFunction1(getRecursivelyReferencedFragments), getSchema = js.Any.fromFunction0(getSchema), getType = js.Any.fromFunction0(getType), getVariableUsages = js.Any.fromFunction1(getVariableUsages), reportError = js.Any.fromFunction1(reportError))
    __obj.asInstanceOf[ValidationContext]
  }
  
  extension [Self <: ValidationContext](x: Self) {
    
    inline def setGetArgument(value: () => GraphQLArgument): Self = StObject.set(x, "getArgument", js.Any.fromFunction0(value))
    
    inline def setGetDirective(value: () => GraphQLDirective): Self = StObject.set(x, "getDirective", js.Any.fromFunction0(value))
    
    inline def setGetDocument(value: () => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
    
    inline def setGetErrors(value: () => js.Array[GraphQLError]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    inline def setGetFieldDef(value: () => GraphQLFieldDefinition): Self = StObject.set(x, "getFieldDef", js.Any.fromFunction0(value))
    
    inline def setGetFragment(value: String => FragmentDefinition): Self = StObject.set(x, "getFragment", js.Any.fromFunction1(value))
    
    inline def setGetFragmentSpreads(value: SelectionSet => js.Array[FragmentSpread]): Self = StObject.set(x, "getFragmentSpreads", js.Any.fromFunction1(value))
    
    inline def setGetInputType(value: () => GraphQLInputType): Self = StObject.set(x, "getInputType", js.Any.fromFunction0(value))
    
    inline def setGetParentType(value: () => GraphQLCompositeType): Self = StObject.set(x, "getParentType", js.Any.fromFunction0(value))
    
    inline def setGetRecursiveVariableUsages(value: OperationDefinition => js.Array[VariableUsage]): Self = StObject.set(x, "getRecursiveVariableUsages", js.Any.fromFunction1(value))
    
    inline def setGetRecursivelyReferencedFragments(value: OperationDefinition => js.Array[FragmentDefinition]): Self = StObject.set(x, "getRecursivelyReferencedFragments", js.Any.fromFunction1(value))
    
    inline def setGetSchema(value: () => GraphQLSchema): Self = StObject.set(x, "getSchema", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => GraphQLOutputType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetVariableUsages(value: HasSelectionSet => js.Array[VariableUsage]): Self = StObject.set(x, "getVariableUsages", js.Any.fromFunction1(value))
    
    inline def setReportError(value: GraphQLError => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
  }
}
