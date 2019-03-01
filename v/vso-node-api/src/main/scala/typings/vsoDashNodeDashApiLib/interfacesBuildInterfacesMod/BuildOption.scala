package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  var enabled: scala.Boolean
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object BuildOption {
  @scala.inline
  def apply(
    definition: BuildOptionDefinitionReference,
    enabled: scala.Boolean,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): BuildOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("inputs")(inputs)
    __obj.asInstanceOf[BuildOption]
  }
}

