package typings.tokeyCssSelectorParser.astTypesMod

import typings.tokeyCore.typesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id
  extends StObject
     with Token[id]
     with FunctionalSelector
     with SimpleSelector {
  
  var nodes: js.UndefOr[SelectorList] = js.undefined
}
object Id {
  
  inline def apply(end: Double, start: Double, value: String): Id = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setNodes(value: SelectorList): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Selector*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
