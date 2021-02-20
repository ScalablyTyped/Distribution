package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Errors
import typings.yaml.utilMod.Type.QUOTE_DOUBLE
import typings.yaml.utilMod.Type.QUOTE_SINGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuoteValue
  extends Scalar
     with Node {
  
  val strValue: Null | String | Errors = js.native
  
  @JSName("type")
  var type_QuoteValue: QUOTE_DOUBLE | QUOTE_SINGLE = js.native
}
object QuoteValue {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE | QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean
  ): QuoteValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteValue]
  }
  
  @scala.inline
  implicit class QuoteValueMutableBuilder[Self <: QuoteValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrValue(value: String | Errors): Self = StObject.set(x, "strValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValueNull: Self = StObject.set(x, "strValue", null)
    
    @scala.inline
    def setType(value: QUOTE_DOUBLE | QUOTE_SINGLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
