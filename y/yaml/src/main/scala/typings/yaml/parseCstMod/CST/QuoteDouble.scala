package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.QUOTE_DOUBLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuoteDouble extends QuoteValue {
  
  @JSName("type")
  var type_QuoteDouble: QUOTE_DOUBLE = js.native
}
object QuoteDouble {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE,
    valueRangeContainsNewline: Boolean
  ): QuoteDouble = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteDouble]
  }
  
  @scala.inline
  implicit class QuoteDoubleMutableBuilder[Self <: QuoteDouble] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: QUOTE_DOUBLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
