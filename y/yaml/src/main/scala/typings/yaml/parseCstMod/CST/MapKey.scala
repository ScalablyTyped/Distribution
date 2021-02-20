package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.MAP_KEY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapKey extends MapItem {
  
  @JSName("type")
  var type_MapKey: MAP_KEY = js.native
}
object MapKey {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: MAP_KEY,
    valueRangeContainsNewline: Boolean
  ): MapKey = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapKey]
  }
  
  @scala.inline
  implicit class MapKeyMutableBuilder[Self <: MapKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MAP_KEY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
