package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.SEQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seq
  extends StObject
     with Node
     with ContentNode {
  
  var items: js.Array[BlankLine | Comment | SeqItem]
  
  @JSName("type")
  var type_Seq: SEQ
}
object Seq {
  
  inline def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[BlankLine | Comment | SeqItem],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ,
    valueRangeContainsNewline: Boolean
  ): Seq = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, range = null, rawValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seq]
  }
  
  extension [Self <: Seq](x: Self) {
    
    inline def setItems(value: js.Array[BlankLine | Comment | SeqItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (BlankLine | Comment | SeqItem)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setType(value: SEQ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
