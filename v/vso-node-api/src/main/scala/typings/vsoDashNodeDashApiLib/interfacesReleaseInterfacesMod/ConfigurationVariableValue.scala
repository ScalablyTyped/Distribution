package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationVariableValue extends js.Object {
  /**
    * Gets or sets as variable is secret or not.
    */
  var isSecret: scala.Boolean
  /**
    * Gets or sets value of the configuration variable.
    */
  var value: java.lang.String
}

object ConfigurationVariableValue {
  @scala.inline
  def apply(isSecret: scala.Boolean, value: java.lang.String): ConfigurationVariableValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSecret")(isSecret)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ConfigurationVariableValue]
  }
}

