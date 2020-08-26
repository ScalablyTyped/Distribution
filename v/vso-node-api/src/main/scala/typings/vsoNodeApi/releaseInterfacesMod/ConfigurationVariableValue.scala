package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationVariableValue extends js.Object {
  /**
    * Gets or sets as variable is secret or not.
    */
  var isSecret: Boolean = js.native
  /**
    * Gets or sets value of the configuration variable.
    */
  var value: String = js.native
}

object ConfigurationVariableValue {
  @scala.inline
  def apply(isSecret: Boolean, value: String): ConfigurationVariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationVariableValue]
  }
  @scala.inline
  implicit class ConfigurationVariableValueOps[Self <: ConfigurationVariableValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsSecret(value: Boolean): Self = this.set("isSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

