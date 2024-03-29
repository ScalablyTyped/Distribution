package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html extends StObject {
  
  var html: String
  
  var photos: String
  
  var self: String
}
object Html {
  
  inline def apply(html: String, photos: String, self: String): Html = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: String): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
