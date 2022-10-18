package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.compound_selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@tokey/core.@tokey/core.Token<'compound_selector'>, 'value'> */
trait CompoundSelector
  extends StObject
     with _SelectorNode {
  
  var after: String
  
  var before: String
  
  var end: Double
  
  var invalid: Boolean
  
  var nodes: js.Array[
    SimpleSelector | Nesting | CommentWithNoSpacing | Invalid | PseudoElement | CompoundSelector | Selector
  ]
  
  var start: Double
  
  var `type`: compound_selector
}
object CompoundSelector {
  
  inline def apply(
    after: String,
    before: String,
    end: Double,
    invalid: Boolean,
    nodes: js.Array[
      SimpleSelector | Nesting | CommentWithNoSpacing | Invalid | PseudoElement | CompoundSelector | Selector
    ],
    start: Double
  ): CompoundSelector = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound_selector")
    __obj.asInstanceOf[CompoundSelector]
  }
  
  extension [Self <: CompoundSelector](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setNodes(
      value: js.Array[
          SimpleSelector | Nesting | CommentWithNoSpacing | Invalid | PseudoElement | CompoundSelector | Selector
        ]
    ): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(
      value: (SimpleSelector | Nesting | CommentWithNoSpacing | Invalid | PseudoElement | CompoundSelector | Selector)*
    ): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: compound_selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
