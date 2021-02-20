package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.QUOTE_SINGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuoteSingle extends QuoteValue {
  
  @JSName("type")
  var type_QuoteSingle: QUOTE_SINGLE = js.native
}
object QuoteSingle {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean
  ): QuoteSingle = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteSingle]
  }
  
  @scala.inline
  implicit class QuoteSingleMutableBuilder[Self <: QuoteSingle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: QUOTE_SINGLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
