package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.MAP_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapValue extends MapItem {
  
  @JSName("type")
  var type_MapValue: MAP_VALUE = js.native
}
object MapValue {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: MAP_VALUE,
    valueRangeContainsNewline: Boolean
  ): MapValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
  
  @scala.inline
  implicit class MapValueMutableBuilder[Self <: MapValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MAP_VALUE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
