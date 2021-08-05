package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UuidData extends StObject {
  
  var os: String
}
object UuidData {
  
  inline def apply(os: String): UuidData = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidData]
  }
  
  extension [Self <: UuidData](x: Self) {
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
