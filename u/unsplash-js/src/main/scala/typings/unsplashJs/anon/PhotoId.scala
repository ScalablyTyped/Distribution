package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoId extends StObject {
  
  var photoId: String | js.Array[String]
}
object PhotoId {
  
  inline def apply(photoId: String | js.Array[String]): PhotoId = {
    val __obj = js.Dynamic.literal(photoId = photoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoId]
  }
  
  extension [Self <: PhotoId](x: Self) {
    
    inline def setPhotoId(value: String | js.Array[String]): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdVarargs(value: String*): Self = StObject.set(x, "photoId", js.Array(value*))
  }
}
