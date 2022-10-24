package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeString extends StObject {
  
  var size: String
  
  var `type`: String
}
object SizeString {
  
  inline def apply(size: String, `type`: String): SizeString = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeString]
  }
  
  extension [Self <: SizeString](x: Self) {
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
