package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.FLOW_MAP
import typings.yaml.utilMod.Type.FLOW_SEQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowCollection
  extends Node
     with ContentNode {
  
  var items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection] = js.native
  
  @JSName("type")
  var type_FlowCollection: FLOW_MAP | FLOW_SEQ = js.native
}
object FlowCollection {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: FLOW_MAP | FLOW_SEQ,
    valueRangeContainsNewline: Boolean
  ): FlowCollection = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCollection]
  }
  
  @scala.inline
  implicit class FlowCollectionMutableBuilder[Self <: FlowCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: (FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setType(value: FLOW_MAP | FLOW_SEQ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
