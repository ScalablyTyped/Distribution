package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleExpressionNode
  extends StObject
     with Node2
     with ExpressionNode {
  
  var constType: ConstantTypes
  
  var content: String
  
  /**
    * Indicates this is an identifier for a hoist vnode call and points to the
    * hoisted node.
    */
  var hoisted: js.UndefOr[JSChildNode] = js.undefined
  
  /**
    * an expression parsed as the params of a function will track
    * the identifiers declared inside the function body.
    */
  var identifiers: js.UndefOr[js.Array[String]] = js.undefined
  
  var isHandlerKey: js.UndefOr[Boolean] = js.undefined
  
  var isStatic: Boolean
  
  @JSName("type")
  var type_SimpleExpressionNode: `4`
}
object SimpleExpressionNode {
  
  inline def apply(constType: ConstantTypes, content: String, isStatic: Boolean, loc: SourceLocation): SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(constType = constType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[SimpleExpressionNode]
  }
  
  extension [Self <: SimpleExpressionNode](x: Self) {
    
    inline def setConstType(value: ConstantTypes): Self = StObject.set(x, "constType", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHoisted(value: JSChildNode): Self = StObject.set(x, "hoisted", value.asInstanceOf[js.Any])
    
    inline def setHoistedUndefined: Self = StObject.set(x, "hoisted", js.undefined)
    
    inline def setIdentifiers(value: js.Array[String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    inline def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setIsHandlerKey(value: Boolean): Self = StObject.set(x, "isHandlerKey", value.asInstanceOf[js.Any])
    
    inline def setIsHandlerKeyUndefined: Self = StObject.set(x, "isHandlerKey", js.undefined)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setType(value: `4`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
