package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// utilities/Typeinfo.js
trait TypeInfo extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: TypeInfo](x: Self) {
    
    inline def setEnter(value: Node => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
    
    inline def setGetArgument(value: () => GraphQLArgument): Self = StObject.set(x, "getArgument", js.Any.fromFunction0(value))
    
    inline def setGetDirective(value: () => GraphQLDirective): Self = StObject.set(x, "getDirective", js.Any.fromFunction0(value))
    
    inline def setGetFieldDef(value: () => GraphQLFieldDefinition): Self = StObject.set(x, "getFieldDef", js.Any.fromFunction0(value))
    
    inline def setGetInputType(value: () => GraphQLInputType): Self = StObject.set(x, "getInputType", js.Any.fromFunction0(value))
    
    inline def setGetParentType(value: () => GraphQLCompositeType): Self = StObject.set(x, "getParentType", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => GraphQLOutputType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setLeave(value: Node => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
  }
}
