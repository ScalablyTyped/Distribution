package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOption extends js.Object {
  /**
    * A reference to the build option.
    */
  var definition: BuildOptionDefinitionReference = js.native
  /**
    * Indicates whether the behavior is enabled.
    */
  var enabled: Boolean = js.native
  var inputs: StringDictionary[String] = js.native
}

object BuildOption {
  @scala.inline
  def apply(definition: BuildOptionDefinitionReference, enabled: Boolean, inputs: StringDictionary[String]): BuildOption = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOption]
  }
  @scala.inline
  implicit class BuildOptionOps[Self <: BuildOption] (val x: Self) extends AnyVal {
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
    def setDefinition(value: BuildOptionDefinitionReference): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
  
}

