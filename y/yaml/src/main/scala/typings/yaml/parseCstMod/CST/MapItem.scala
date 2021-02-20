package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.MAP_KEY
import typings.yaml.utilMod.Type.MAP_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapItem extends Node {
  
  var node: ContentNode | Null = js.native
  
  @JSName("type")
  var type_MapItem: MAP_KEY | MAP_VALUE = js.native
}
object MapItem {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: MAP_KEY | MAP_VALUE,
    valueRangeContainsNewline: Boolean
  ): MapItem = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapItem]
  }
  
  @scala.inline
  implicit class MapItemMutableBuilder[Self <: MapItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: ContentNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNull: Self = StObject.set(x, "node", null)
    
    @scala.inline
    def setType(value: MAP_KEY | MAP_VALUE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
