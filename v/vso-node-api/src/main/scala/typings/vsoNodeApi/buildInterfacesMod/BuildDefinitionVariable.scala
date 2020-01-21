package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionVariable extends js.Object {
  /**
    * Indicates whether the value can be set at queue time.
    */
  var allowOverride: Boolean
  /**
    * Indicates whether the variable's value is a secret.
    */
  var isSecret: Boolean
  /**
    * The value of the variable.
    */
  var value: String
}

object BuildDefinitionVariable {
  @scala.inline
  def apply(allowOverride: Boolean, isSecret: Boolean, value: String): BuildDefinitionVariable = {
    val __obj = js.Dynamic.literal(allowOverride = allowOverride.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildDefinitionVariable]
  }
}

