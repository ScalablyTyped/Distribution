package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: scala.Double
  
  var supported: scala.Double
  
  var unsupported: scala.Double
}
object Required {
  
  inline def apply(required: scala.Double, supported: scala.Double, unsupported: scala.Double): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setRequired(value: scala.Double): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: scala.Double): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setUnsupported(value: scala.Double): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
  }
}
