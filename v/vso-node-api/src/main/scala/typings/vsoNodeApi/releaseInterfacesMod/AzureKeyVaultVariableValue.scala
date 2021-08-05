package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureKeyVaultVariableValue
  extends StObject
     with VariableValue {
  
  var contentType: String
  
  var enabled: Boolean
  
  var expires: Date
}
object AzureKeyVaultVariableValue {
  
  inline def apply(contentType: String, enabled: Boolean, expires: Date, isSecret: Boolean, value: String): AzureKeyVaultVariableValue = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureKeyVaultVariableValue]
  }
  
  extension [Self <: AzureKeyVaultVariableValue](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
  }
}
