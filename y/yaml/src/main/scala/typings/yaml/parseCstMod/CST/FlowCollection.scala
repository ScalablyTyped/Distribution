package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.FLOW_MAP
import typings.yaml.utilMod.Type.FLOW_SEQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowCollection
  extends StObject
     with Node
     with ContentNode {
  
  var items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection]
  
  @JSName("type")
  var type_FlowCollection: FLOW_MAP | FLOW_SEQ
}
object FlowCollection {
  
  inline def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: FLOW_MAP | FLOW_SEQ,
    valueRangeContainsNewline: Boolean
  ): FlowCollection = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, range = null, rawValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCollection]
  }
  
  extension [Self <: FlowCollection](x: Self) {
    
    inline def setItems(value: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setType(value: FLOW_MAP | FLOW_SEQ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
