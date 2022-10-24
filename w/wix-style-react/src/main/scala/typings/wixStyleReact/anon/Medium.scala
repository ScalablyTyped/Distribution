package typings.wixStyleReact.anon

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var image: FC[js.Object]
  
  var large: FC[js.Object]
  
  var medium: FC[js.Object]
  
  var small: FC[js.Object]
  
  var tiny: FC[js.Object]
}
object Medium {
  
  inline def apply(
    image: FC[js.Object],
    large: FC[js.Object],
    medium: FC[js.Object],
    small: FC[js.Object],
    tiny: FC[js.Object]
  ): Medium = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medium]
  }
  
  extension [Self <: Medium](x: Self) {
    
    inline def setImage(value: FC[js.Object]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setLarge(value: FC[js.Object]): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: FC[js.Object]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: FC[js.Object]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setTiny(value: FC[js.Object]): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
  }
}
