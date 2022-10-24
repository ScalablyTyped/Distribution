package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BelowNode extends StObject {
  
  var belowNode: Requireable[ReactNodeLike]
  
  var disabled: Requireable[Boolean]
  
  var extraNode: Requireable[ReactNodeLike]
  
  var extraText: Requireable[String]
  
  var id: Validator[String | Double]
  
  var image: Requireable[ReactNodeLike]
  
  var selected: Requireable[Boolean]
  
  var showBelowNodeOnSelect: Requireable[Boolean]
  
  var subtitle: Requireable[String]
  
  var subtitleNode: Requireable[ReactNodeLike]
  
  var title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]
}
object BelowNode {
  
  inline def apply(
    belowNode: Requireable[ReactNodeLike],
    disabled: Requireable[Boolean],
    extraNode: Requireable[ReactNodeLike],
    extraText: Requireable[String],
    id: Validator[String | Double],
    image: Requireable[ReactNodeLike],
    selected: Requireable[Boolean],
    showBelowNodeOnSelect: Requireable[Boolean],
    subtitle: Requireable[String],
    subtitleNode: Requireable[ReactNodeLike],
    title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  ): BelowNode = {
    val __obj = js.Dynamic.literal(belowNode = belowNode.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], extraNode = extraNode.asInstanceOf[js.Any], extraText = extraText.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], showBelowNodeOnSelect = showBelowNodeOnSelect.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], subtitleNode = subtitleNode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BelowNode]
  }
  
  extension [Self <: BelowNode](x: Self) {
    
    inline def setBelowNode(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "belowNode", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setExtraNode(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "extraNode", value.asInstanceOf[js.Any])
    
    inline def setExtraText(value: Requireable[String]): Self = StObject.set(x, "extraText", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String | Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Requireable[Boolean]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setShowBelowNodeOnSelect(value: Requireable[Boolean]): Self = StObject.set(x, "showBelowNodeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Requireable[String]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleNode(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "subtitleNode", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
