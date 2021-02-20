package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.BLOCK_FOLDED
import typings.yaml.yamlStrings.CLIP
import typings.yaml.yamlStrings.KEEP
import typings.yaml.yamlStrings.STRIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockFolded extends BlockValue {
  
  @JSName("type")
  var type_BlockFolded: BLOCK_FOLDED = js.native
}
object BlockFolded {
  
  @scala.inline
  def apply(
    chomping: CLIP | KEEP | STRIP,
    hasComment: Boolean,
    hasProps: Boolean,
    header: Range,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLOCK_FOLDED,
    valueRangeContainsNewline: Boolean
  ): BlockFolded = {
    val __obj = js.Dynamic.literal(chomping = chomping.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockFolded]
  }
  
  @scala.inline
  implicit class BlockFoldedMutableBuilder[Self <: BlockFolded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BLOCK_FOLDED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
