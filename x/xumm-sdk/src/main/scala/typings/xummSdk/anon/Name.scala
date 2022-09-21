package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var uuidv4: String
}
object Name {
  
  inline def apply(name: String, uuidv4: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuidv4 = uuidv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUuidv4(value: String): Self = StObject.set(x, "uuidv4", value.asInstanceOf[js.Any])
  }
}
