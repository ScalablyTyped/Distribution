package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Directives
trait Directive
  extends StObject
     with Node {
  
  var arguments: js.UndefOr[js.Array[Argument]] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: Name
}
object Directive {
  
  inline def apply(kind: String, name: Name): Directive = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
  
  extension [Self <: Directive](x: Self) {
    
    inline def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
