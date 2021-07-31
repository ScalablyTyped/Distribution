package typings.wixStyleReact.anon

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var image: FC[js.Object]
  
  var large: FC[js.Object]
  
  var medium: FC[js.Object]
  
  var small: FC[js.Object]
  
  var tiny: FC[js.Object]
}
object Image {
  
  @scala.inline
  def apply(
    image: FC[js.Object],
    large: FC[js.Object],
    medium: FC[js.Object],
    small: FC[js.Object],
    tiny: FC[js.Object]
  ): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: FC[js.Object]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge(value: FC[js.Object]): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: FC[js.Object]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: FC[js.Object]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiny(value: FC[js.Object]): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
  }
}
