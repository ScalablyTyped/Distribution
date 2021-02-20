package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.SEQ_ITEM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeqItem extends Node {
  
  var node: ContentNode | Null = js.native
  
  @JSName("type")
  var type_SeqItem: SEQ_ITEM = js.native
}
object SeqItem {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ_ITEM,
    valueRangeContainsNewline: Boolean
  ): SeqItem = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqItem]
  }
  
  @scala.inline
  implicit class SeqItemMutableBuilder[Self <: SeqItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: ContentNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNull: Self = StObject.set(x, "node", null)
    
    @scala.inline
    def setType(value: SEQ_ITEM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
