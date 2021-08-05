package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var file: String
  
  var height: Double
  
  var mime_type: String
  
  var source_url: String
  
  var width: Double
}
object File {
  
  inline def apply(file: String, height: Double, mime_type: String, source_url: String, width: Double): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], source_url = source_url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setSource_url(value: String): Self = StObject.set(x, "source_url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
