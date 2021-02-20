package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureKeyVaultVariableValue extends VariableValue {
  
  var contentType: String = js.native
  
  var enabled: Boolean = js.native
  
  var expires: Date = js.native
}
object AzureKeyVaultVariableValue {
  
  @scala.inline
  def apply(contentType: String, enabled: Boolean, expires: Date, isSecret: Boolean, value: String): AzureKeyVaultVariableValue = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureKeyVaultVariableValue]
  }
  
  @scala.inline
  implicit class AzureKeyVaultVariableValueMutableBuilder[Self <: AzureKeyVaultVariableValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
  }
}
