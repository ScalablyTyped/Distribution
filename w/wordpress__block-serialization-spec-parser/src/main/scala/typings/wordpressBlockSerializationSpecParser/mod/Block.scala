package typings.wordpressBlockSerializationSpecParser.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  var attrs: Record[String, _] = js.native
  
  var blockName: String | Null = js.native
  
  var innerBlocks: js.Array[Block] = js.native
  
  var innerContent: js.Array[String] = js.native
  
  var innerHTML: String = js.native
}
object Block {
  
  @scala.inline
  def apply(
    attrs: Record[String, _],
    innerBlocks: js.Array[Block],
    innerContent: js.Array[String],
    innerHTML: String
  ): Block = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], innerContent = innerContent.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: Record[String, _]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBlocksVarargs(value: Block*): Self = this.set("innerBlocks", js.Array(value :_*))
    
    @scala.inline
    def setInnerBlocks(value: js.Array[Block]): Self = this.set("innerBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerContentVarargs(value: String*): Self = this.set("innerContent", js.Array(value :_*))
    
    @scala.inline
    def setInnerContent(value: js.Array[String]): Self = this.set("innerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockName(value: String): Self = this.set("blockName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNameNull: Self = this.set("blockName", null)
  }
}
