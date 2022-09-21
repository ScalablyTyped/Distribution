package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporaryDataCreatedDTO
  extends StObject
     with TemporaryDataDTO {
  
  var expirationDate: js.Date
  
  var id: String
  
  var url: String
}
object TemporaryDataCreatedDTO {
  
  inline def apply(
    expirationDate: js.Date,
    expirationSeconds: Double,
    id: String,
    origin: String,
    url: String,
    value: Any
  ): TemporaryDataCreatedDTO = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
  
  extension [Self <: TemporaryDataCreatedDTO](x: Self) {
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
