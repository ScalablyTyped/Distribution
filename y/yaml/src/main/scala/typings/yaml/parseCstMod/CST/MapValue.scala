package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.MAP_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValue
  extends StObject
     with MapItem {
  
  @JSName("type")
  var type_MapValue: MAP_VALUE
}
object MapValue {
  
  inline def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: MAP_VALUE,
    valueRangeContainsNewline: Boolean
  ): MapValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, node = null, range = null, rawValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
  
  extension [Self <: MapValue](x: Self) {
    
    inline def setType(value: MAP_VALUE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
