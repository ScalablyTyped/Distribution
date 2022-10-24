package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageContainer extends StObject {
  
  var imageContainer: Requireable[String]
}
object ImageContainer {
  
  inline def apply(imageContainer: Requireable[String]): ImageContainer = {
    val __obj = js.Dynamic.literal(imageContainer = imageContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageContainer]
  }
  
  extension [Self <: ImageContainer](x: Self) {
    
    inline def setImageContainer(value: Requireable[String]): Self = StObject.set(x, "imageContainer", value.asInstanceOf[js.Any])
  }
}
