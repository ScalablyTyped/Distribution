package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporaryDataDTO extends StObject {
  
  var expirationSeconds: Double
  
  var origin: String
  
  var value: Any
}
object TemporaryDataDTO {
  
  inline def apply(expirationSeconds: Double, origin: String, value: Any): TemporaryDataDTO = {
    val __obj = js.Dynamic.literal(expirationSeconds = expirationSeconds.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataDTO]
  }
  
  extension [Self <: TemporaryDataDTO](x: Self) {
    
    inline def setExpirationSeconds(value: Double): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
