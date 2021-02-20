package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.SEQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seq
  extends Node
     with ContentNode {
  
  var items: js.Array[BlankLine | Comment | SeqItem] = js.native
  
  @JSName("type")
  var type_Seq: SEQ = js.native
}
object Seq {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[BlankLine | Comment | SeqItem],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ,
    valueRangeContainsNewline: Boolean
  ): Seq = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seq]
  }
  
  @scala.inline
  implicit class SeqMutableBuilder[Self <: Seq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BlankLine | Comment | SeqItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: (BlankLine | Comment | SeqItem)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setType(value: SEQ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
