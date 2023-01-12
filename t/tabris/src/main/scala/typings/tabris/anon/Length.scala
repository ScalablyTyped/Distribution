package typings.tabris.anon

import typings.tabris.tabrisStrings.`AES-GCM`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var length: Double
  
  var name: `AES-GCM`
}
object Length {
  
  inline def apply(length: Double): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = "AES-GCM")
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: `AES-GCM`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
