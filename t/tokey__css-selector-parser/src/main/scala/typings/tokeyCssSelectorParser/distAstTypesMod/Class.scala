package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class
  extends StObject
     with Token[`class`]
     with FunctionalSelector
     with SimpleSelector {
  
  var dotComments: SelectorNodes
  
  var nodes: js.UndefOr[SelectorList] = js.undefined
}
object Class {
  
  inline def apply(dotComments: SelectorNodes, end: Double, start: Double, value: String): Class = {
    val __obj = js.Dynamic.literal(dotComments = dotComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    inline def setDotComments(value: SelectorNodes): Self = StObject.set(x, "dotComments", value.asInstanceOf[js.Any])
    
    inline def setDotCommentsVarargs(value: SelectorNode*): Self = StObject.set(x, "dotComments", js.Array(value*))
    
    inline def setNodes(value: SelectorList): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Selector*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
