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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("isSecret")(isSecret)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AzureKeyVaultVariableValue]
  }
}

