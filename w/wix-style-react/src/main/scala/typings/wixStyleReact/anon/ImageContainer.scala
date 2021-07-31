package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageContainer extends StObject {
  
  var imageContainer: js.UndefOr[String] = js.undefined
}
object ImageContainer {
  
  @scala.inline
  def apply(): ImageContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageContainer]
  }
  
  @scala.inline
  implicit class ImageContainerMutableBuilder[Self <: ImageContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageContainer(value: String): Self = StObject.set(x, "imageContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContainerUndefined: Self = StObject.set(x, "imageContainer", js.undefined)
  }
}
