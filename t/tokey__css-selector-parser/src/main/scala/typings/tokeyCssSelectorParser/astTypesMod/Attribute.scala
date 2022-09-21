package typings.tokeyCssSelectorParser.astTypesMod

import typings.tokeyCore.typesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute
  extends StObject
     with Token[attribute]
     with FunctionalSelector
     with SimpleSelector {
  
  var nodes: js.UndefOr[SelectorList] = js.undefined
}
object Attribute {
  
  inline def apply(end: Double, start: Double, value: String): Attribute = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setNodes(value: SelectorList): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Selector*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
