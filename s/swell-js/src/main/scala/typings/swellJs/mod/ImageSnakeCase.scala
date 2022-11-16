package typings.swellJs.mod

import typings.swellJs.anon.Contenttype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSnakeCase
  extends StObject
     with Image {
  
  var file: Contenttype
  
  var id: String
}
object ImageSnakeCase {
  
  inline def apply(file: Contenttype, id: String): ImageSnakeCase = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSnakeCase]
  }
  
  extension [Self <: ImageSnakeCase](x: Self) {
    
    inline def setFile(value: Contenttype): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
