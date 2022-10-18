package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.anon.First
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.pseudo_element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoElement
  extends StObject
     with Token[pseudo_element]
     with FunctionalSelector {
  
  var colonComments: First
  
  var nodes: js.UndefOr[SelectorList] = js.undefined
}
object PseudoElement {
  
  inline def apply(colonComments: First, end: Double, start: Double, value: String): PseudoElement = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_element")
    __obj.asInstanceOf[PseudoElement]
  }
  
  extension [Self <: PseudoElement](x: Self) {
    
    inline def setColonComments(value: First): Self = StObject.set(x, "colonComments", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: SelectorList): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Selector*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
