package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.SEQ_ITEM
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
  implicit class SeqItemOps[Self <: SeqItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: SEQ_ITEM): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ContentNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
  }
}
