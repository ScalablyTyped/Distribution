package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLScalarTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var parseLiteral: js.UndefOr[js.Function1[/* valueAST */ Value, Any]] = js.undefined
  
  var parseValue: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
  
  def serialize(value: Any): Any
}
object GraphQLScalarTypeConfig {
  
  inline def apply(name: String, serialize: Any => Any): GraphQLScalarTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[GraphQLScalarTypeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQLScalarTypeConfig] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParseLiteral(value: /* valueAST */ Value => Any): Self = StObject.set(x, "parseLiteral", js.Any.fromFunction1(value))
    
    inline def setParseLiteralUndefined: Self = StObject.set(x, "parseLiteral", js.undefined)
    
    inline def setParseValue(value: /* value */ Any => Any): Self = StObject.set(x, "parseValue", js.Any.fromFunction1(value))
    
    inline def setParseValueUndefined: Self = StObject.set(x, "parseValue", js.undefined)
    
    inline def setSerialize(value: Any => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
