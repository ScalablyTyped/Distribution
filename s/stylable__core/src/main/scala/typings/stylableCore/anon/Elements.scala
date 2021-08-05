package typings.stylableCore.anon

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stylableTransformerMod.ResolvedElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements extends StObject {
  
  var elements: js.Array[js.Array[ResolvedElement]]
  
  var selector: String
  
  var targetSelectorAst: SelectorAstNode
}
object Elements {
  
  inline def apply(
    elements: js.Array[js.Array[ResolvedElement]],
    selector: String,
    targetSelectorAst: SelectorAstNode
  ): Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], targetSelectorAst = targetSelectorAst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  extension [Self <: Elements](x: Self) {
    
    inline def setElements(value: js.Array[js.Array[ResolvedElement]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: js.Array[ResolvedElement]*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectorAst(value: SelectorAstNode): Self = StObject.set(x, "targetSelectorAst", value.asInstanceOf[js.Any])
  }
}
