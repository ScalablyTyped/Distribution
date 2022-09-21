package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uuidv4 extends StObject {
  
  var uuidv4: String
}
object Uuidv4 {
  
  inline def apply(uuidv4: String): Uuidv4 = {
    val __obj = js.Dynamic.literal(uuidv4 = uuidv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuidv4]
  }
  
  extension [Self <: Uuidv4](x: Self) {
    
    inline def setUuidv4(value: String): Self = StObject.set(x, "uuidv4", value.asInstanceOf[js.Any])
  }
}
