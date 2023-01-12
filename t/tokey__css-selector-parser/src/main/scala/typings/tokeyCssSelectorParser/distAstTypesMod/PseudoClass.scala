package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.pseudo_class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoClass
  extends StObject
     with Token[pseudo_class]
     with FunctionalSelector
     with SimpleSelector {
  
  var colonComments: js.Array[Comment]
  
  var nodes: js.UndefOr[SelectorList | NthSelectorList] = js.undefined
}
object PseudoClass {
  
  inline def apply(colonComments: js.Array[Comment], end: Double, start: Double, value: String): PseudoClass = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_class")
    __obj.asInstanceOf[PseudoClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PseudoClass] (val x: Self) extends AnyVal {
    
    inline def setColonComments(value: js.Array[Comment]): Self = StObject.set(x, "colonComments", value.asInstanceOf[js.Any])
    
    inline def setColonCommentsVarargs(value: Comment*): Self = StObject.set(x, "colonComments", js.Array(value*))
    
    inline def setNodes(value: SelectorList | NthSelectorList): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Selector*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
