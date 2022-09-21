package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Downloadlocation extends StObject {
  
  var download: String
  
  var download_location: String
  
  var html: String
  
  var self: String
}
object Downloadlocation {
  
  inline def apply(download: String, download_location: String, html: String, self: String): Downloadlocation = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], download_location = download_location.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadlocation]
  }
  
  extension [Self <: Downloadlocation](x: Self) {
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownload_location(value: String): Self = StObject.set(x, "download_location", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
