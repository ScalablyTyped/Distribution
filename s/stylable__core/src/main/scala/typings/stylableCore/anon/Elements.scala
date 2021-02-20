package typings.stylableCore.anon

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stylableTransformerMod.ResolvedElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elements extends StObject {
  
  var elements: js.Array[js.Array[ResolvedElement]] = js.native
  
  var selector: String = js.native
  
  var targetSelectorAst: SelectorAstNode = js.native
}
object Elements {
  
  @scala.inline
  def apply(
    elements: js.Array[js.Array[ResolvedElement]],
    selector: String,
    targetSelectorAst: SelectorAstNode
  ): Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], targetSelectorAst = targetSelectorAst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  @scala.inline
  implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[js.Array[ResolvedElement]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: js.Array[ResolvedElement]*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectorAst(value: SelectorAstNode): Self = StObject.set(x, "targetSelectorAst", value.asInstanceOf[js.Any])
  }
}
