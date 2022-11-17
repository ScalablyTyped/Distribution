package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveNode
  extends StObject
     with Node2 {
  
  var arg: js.UndefOr[ExpressionNode] = js.undefined
  
  var exp: js.UndefOr[ExpressionNode] = js.undefined
  
  var modifiers: js.Array[String]
  
  var name: String
  
  /**
    * optional property to cache the expression parse result for v-for
    */
  var parseResult: js.UndefOr[ForParseResult] = js.undefined
  
  @JSName("type")
  var type_DirectiveNode: 7
}
object DirectiveNode {
  
  inline def apply(loc: SourceLocation, modifiers: js.Array[String], name: String): DirectiveNode = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(7)
    __obj.asInstanceOf[DirectiveNode]
  }
  
  extension [Self <: DirectiveNode](x: Self) {
    
    inline def setArg(value: ExpressionNode): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    inline def setExp(value: ExpressionNode): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setModifiers(value: js.Array[String]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: String*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParseResult(value: ForParseResult): Self = StObject.set(x, "parseResult", value.asInstanceOf[js.Any])
    
    inline def setParseResultUndefined: Self = StObject.set(x, "parseResult", js.undefined)
    
    inline def setType(value: 7): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
