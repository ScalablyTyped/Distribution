package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.QUOTE_DOUBLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuoteDouble
  extends StObject
     with QuoteValue {
  
  @JSName("type")
  var type_QuoteDouble: QUOTE_DOUBLE
}
object QuoteDouble {
  
  inline def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE,
    valueRangeContainsNewline: Boolean
  ): QuoteDouble = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, range = null, rawValue = null, strValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteDouble]
  }
  
  extension [Self <: QuoteDouble](x: Self) {
    
    inline def setType(value: QUOTE_DOUBLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
