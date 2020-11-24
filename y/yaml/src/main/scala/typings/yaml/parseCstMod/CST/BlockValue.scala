package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.BLOCK_FOLDED
import typings.yaml.utilMod.Type.BLOCK_LITERAL
import typings.yaml.yamlStrings.CLIP
import typings.yaml.yamlStrings.KEEP
import typings.yaml.yamlStrings.STRIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockValue
  extends Scalar
     with Node {
  
  var blockIndent: Double | Null = js.native
  
  var chomping: CLIP | KEEP | STRIP = js.native
  
  var header: Range = js.native
  
  val strValue: String | Null = js.native
  
  @JSName("type")
  var type_BlockValue: BLOCK_FOLDED | BLOCK_LITERAL = js.native
}
object BlockValue {
  
  @scala.inline
  def apply(
    chomping: CLIP | KEEP | STRIP,
    hasComment: Boolean,
    hasProps: Boolean,
    header: Range,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLOCK_FOLDED | BLOCK_LITERAL,
    valueRangeContainsNewline: Boolean
  ): BlockValue = {
    val __obj = js.Dynamic.literal(chomping = chomping.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockValue]
  }
  
  @scala.inline
  implicit class BlockValueOps[Self <: BlockValue] (val x: Self) extends AnyVal {
    
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
    def setChomping(value: CLIP | KEEP | STRIP): Self = this.set("chomping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: Range): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BLOCK_FOLDED | BLOCK_LITERAL): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIndent(value: Double): Self = this.set("blockIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIndentNull: Self = this.set("blockIndent", null)
    
    @scala.inline
    def setStrValue(value: String): Self = this.set("strValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValueNull: Self = this.set("strValue", null)
  }
}
