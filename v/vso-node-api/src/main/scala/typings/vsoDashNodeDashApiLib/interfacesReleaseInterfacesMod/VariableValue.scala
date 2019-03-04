package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableValue extends js.Object {
  var isSecret: scala.Boolean
  var value: java.lang.String
}

object VariableValue {
  @scala.inline
  def apply(isSecret: scala.Boolean, value: java.lang.String): VariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret, value = value)
  
    __obj.asInstanceOf[VariableValue]
  }
}

