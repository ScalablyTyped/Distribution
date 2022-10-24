package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaLabel extends StObject {
  
  var ariaLabel: Requireable[String]
  
  var color: Requireable[String]
  
  var imgProp: Requireable[js.Object]
  
  var name: Requireable[String]
  
  var placeholder: Requireable[ReactNodeLike]
  
  var text: Requireable[String]
  
  var title: Requireable[String]
}
object AriaLabel {
  
  inline def apply(
    ariaLabel: Requireable[String],
    color: Requireable[String],
    imgProp: Requireable[js.Object],
    name: Requireable[String],
    placeholder: Requireable[ReactNodeLike],
    text: Requireable[String],
    title: Requireable[String]
  ): AriaLabel = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], imgProp = imgProp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaLabel]
  }
  
  extension [Self <: AriaLabel](x: Self) {
    
    inline def setAriaLabel(value: Requireable[String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Requireable[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setImgProp(value: Requireable[js.Object]): Self = StObject.set(x, "imgProp", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setText(value: Requireable[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
