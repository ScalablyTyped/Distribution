package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@tokey/core.@tokey/core.Token<'nth'>, 'value'> */
trait Nth
  extends StObject
     with _SelectorNode {
  
  var after: String
  
  var before: String
  
  var end: Double
  
  var nodes: js.Array[NthNode]
  
  var start: Double
  
  var `type`: nth
}
object Nth {
  
  inline def apply(after: String, before: String, end: Double, nodes: js.Array[NthNode], start: Double): Nth = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth")
    __obj.asInstanceOf[Nth]
  }
  
  extension [Self <: Nth](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[NthNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NthNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: nth): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
