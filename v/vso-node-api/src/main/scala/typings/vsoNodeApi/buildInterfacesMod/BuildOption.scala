package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOption extends js.Object {
  /**
    * A reference to the build option.
    */
  var definition: BuildOptionDefinitionReference
  /**
    * Indicates whether the behavior is enabled.
    */
  var enabled: Boolean
  var inputs: StringDictionary[String]
}

object BuildOption {
  @scala.inline
  def apply(definition: BuildOptionDefinitionReference, enabled: Boolean, inputs: StringDictionary[String]): BuildOption = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOption]
  }
}

