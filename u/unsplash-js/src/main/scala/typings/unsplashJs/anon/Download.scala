package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Download extends StObject {
  
  var download: js.UndefOr[String] = js.undefined
  
  var html: String
  
  var photos: String
  
  var related: js.UndefOr[String] = js.undefined
  
  var self: String
}
object Download {
  
  inline def apply(html: String, photos: String, self: String): Download = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Download]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Download] (val x: Self) extends AnyVal {
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: String): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setRelated(value: String): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
