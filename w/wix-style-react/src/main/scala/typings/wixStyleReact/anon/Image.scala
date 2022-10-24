package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var image: Requireable[ReactNodeLike]
  
  var text: Requireable[String]
  
  var title: Requireable[String]
}
object Image {
  
  inline def apply(image: Requireable[ReactNodeLike], text: Requireable[String], title: Requireable[String]): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setImage(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setText(value: Requireable[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
