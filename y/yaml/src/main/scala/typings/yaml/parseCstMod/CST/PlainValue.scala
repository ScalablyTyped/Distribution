package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.PLAIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlainValue
  extends Scalar
     with Node {
  
  val strValue: String | Null = js.native
  
  @JSName("type")
  var type_PlainValue: PLAIN = js.native
}
object PlainValue {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: PLAIN,
    valueRangeContainsNewline: Boolean
  ): PlainValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainValue]
  }
  
  @scala.inline
  implicit class PlainValueMutableBuilder[Self <: PlainValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrValue(value: String): Self = StObject.set(x, "strValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValueNull: Self = StObject.set(x, "strValue", null)
    
    @scala.inline
    def setType(value: PLAIN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
