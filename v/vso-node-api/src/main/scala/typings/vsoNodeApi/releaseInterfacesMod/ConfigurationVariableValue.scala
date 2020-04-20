package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationVariableValue extends js.Object {
  /**
    * Gets or sets as variable is secret or not.
    */
  var isSecret: Boolean
  /**
    * Gets or sets value of the configuration variable.
    */
  var value: String
}

object ConfigurationVariableValue {
  @scala.inline
  def apply(isSecret: Boolean, value: String): ConfigurationVariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationVariableValue]
  }
}

