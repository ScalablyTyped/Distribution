package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureKeyVaultVariableValue extends VariableValue {
  var contentType: java.lang.String
  var enabled: scala.Boolean
  var expires: stdLib.Date
}

object AzureKeyVaultVariableValue {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    enabled: scala.Boolean,
    expires: stdLib.Date,
    isSecret: scala.Boolean,
    value: java.lang.String
  ): AzureKeyVaultVariableValue = {
    val __obj = js.Dynamic.literal(contentType = contentType, enabled = enabled, expires = expires, isSecret = isSecret, value = value)
  
    __obj.asInstanceOf[AzureKeyVaultVariableValue]
  }
}

