package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.SEQ_ITEM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeqItem
  extends StObject
     with Node {
  
  var node: ContentNode | Null
  
  @JSName("type")
  var type_SeqItem: SEQ_ITEM
}
object SeqItem {
  
  inline def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ_ITEM,
    valueRangeContainsNewline: Boolean
  ): SeqItem = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, node = null, range = null, rawValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqItem]
  }
  
  extension [Self <: SeqItem](x: Self) {
    
    inline def setNode(value: ContentNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
    
    inline def setType(value: SEQ_ITEM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
