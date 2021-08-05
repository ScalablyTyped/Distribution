package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Errors
import typings.yaml.utilMod.Type.QUOTE_DOUBLE
import typings.yaml.utilMod.Type.QUOTE_SINGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuoteValue
  extends StObject
     with Node
     with Scalar {
  
  val strValue: Null | String | Errors
  
  @JSName("type")
  var type_QuoteValue: QUOTE_DOUBLE | QUOTE_SINGLE
}
object QuoteValue {
  
  inline def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE | QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean
  ): QuoteValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, range = null, rawValue = null, strValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteValue]
  }
  
  extension [Self <: QuoteValue](x: Self) {
    
    inline def setStrValue(value: String | Errors): Self = StObject.set(x, "strValue", value.asInstanceOf[js.Any])
    
    inline def setStrValueNull: Self = StObject.set(x, "strValue", null)
    
    inline def setType(value: QUOTE_DOUBLE | QUOTE_SINGLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
