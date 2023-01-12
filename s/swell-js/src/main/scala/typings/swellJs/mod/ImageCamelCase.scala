package typings.swellJs.mod

import typings.swellJs.anon.ContentType_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCamelCase
  extends StObject
     with Image {
  
  var file: ContentType_
  
  var id: String
}
object ImageCamelCase {
  
  inline def apply(file: ContentType_, id: String): ImageCamelCase = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCamelCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageCamelCase] (val x: Self) extends AnyVal {
    
    inline def setFile(value: ContentType_): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
