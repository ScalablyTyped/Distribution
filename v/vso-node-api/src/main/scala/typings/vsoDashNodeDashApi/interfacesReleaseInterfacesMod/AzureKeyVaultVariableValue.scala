package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureKeyVaultVariableValue extends VariableValue {
  var contentType: String
  var enabled: Boolean
  var expires: Date
}

object AzureKeyVaultVariableValue {
  @scala.inline
  def apply(contentType: String, enabled: Boolean, expires: Date, isSecret: Boolean, value: String): AzureKeyVaultVariableValue = {
    val __obj = js.Dynamic.literal(contentType = contentType, enabled = enabled, expires = expires, isSecret = isSecret, value = value)
  
    __obj.asInstanceOf[AzureKeyVaultVariableValue]
  }
}

