package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionVariable extends js.Object {
  /**
    * Indicates whether the value can be set at queue time.
    */
  var allowOverride: scala.Boolean
  /**
    * Indicates whether the variable's value is a secret.
    */
  var isSecret: scala.Boolean
  /**
    * The value of the variable.
    */
  var value: java.lang.String
}

object BuildDefinitionVariable {
  @scala.inline
  def apply(allowOverride: scala.Boolean, isSecret: scala.Boolean, value: java.lang.String): BuildDefinitionVariable = {
    val __obj = js.Dynamic.literal(allowOverride = allowOverride, isSecret = isSecret, value = value)
  
    __obj.asInstanceOf[BuildDefinitionVariable]
  }
}

