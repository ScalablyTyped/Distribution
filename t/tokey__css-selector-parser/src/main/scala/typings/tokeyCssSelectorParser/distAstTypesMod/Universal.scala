package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Universal
  extends StObject
     with Token[universal]
     with NamespacedNode
     with SimpleSelector {
  
  var namespace: js.UndefOr[Namespace] = js.undefined
  
  var nodes: js.UndefOr[SelectorList] = js.undefined
}
object Universal {
  
  inline def apply(end: Double, start: Double, value: String): Universal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[Universal]
  }
  
  extension [Self <: Universal](x: Self) {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNodes(value: SelectorList): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Selector*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
