package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.BLANK_LINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlankLine
  extends StObject
     with Node {
  
  @JSName("type")
  var type_BlankLine: BLANK_LINE
}
object BlankLine {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLANK_LINE,
    valueRangeContainsNewline: Boolean
  ): BlankLine = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, range = null, rawValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankLine]
  }
  
  @scala.inline
  implicit class BlankLineMutableBuilder[Self <: BlankLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BLANK_LINE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
