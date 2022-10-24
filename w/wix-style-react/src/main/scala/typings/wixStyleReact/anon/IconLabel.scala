package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconLabel extends StObject {
  
  /** item's icon */
  var icon: Requireable[ReactNodeLike]
  
  /** item's text */
  var label: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  /** Ellipsis for item's label */
  var labelEllipsis: Requireable[Boolean]
  
  /** item's line type */
  var line: Requireable[String]
  
  /** item's skin (deprecated)*/
  var skin: Requireable[String]
  
  /** custom width for item */
  var width: Requireable[String | Double]
}
object IconLabel {
  
  inline def apply(
    icon: Requireable[ReactNodeLike],
    label: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    labelEllipsis: Requireable[Boolean],
    line: Requireable[String],
    skin: Requireable[String],
    width: Requireable[String | Double]
  ): IconLabel = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelEllipsis = labelEllipsis.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconLabel]
  }
  
  extension [Self <: IconLabel](x: Self) {
    
    inline def setIcon(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelEllipsis(value: Requireable[Boolean]): Self = StObject.set(x, "labelEllipsis", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Requireable[String]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Requireable[String]): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
