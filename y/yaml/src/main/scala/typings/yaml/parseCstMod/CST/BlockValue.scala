package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.BLOCK_FOLDED
import typings.yaml.utilMod.Type.BLOCK_LITERAL
import typings.yaml.yamlStrings.CLIP
import typings.yaml.yamlStrings.KEEP
import typings.yaml.yamlStrings.STRIP
import org.scalablytyped.runtime.StObject
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
  implicit class BlockValueMutableBuilder[Self <: BlockValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIndent(value: Double): Self = StObject.set(x, "blockIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIndentNull: Self = StObject.set(x, "blockIndent", null)
    
    @scala.inline
    def setChomping(value: CLIP | KEEP | STRIP): Self = StObject.set(x, "chomping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: Range): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValue(value: String): Self = StObject.set(x, "strValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValueNull: Self = StObject.set(x, "strValue", null)
    
    @scala.inline
    def setType(value: BLOCK_FOLDED | BLOCK_LITERAL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
