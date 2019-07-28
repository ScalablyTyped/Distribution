package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableValue extends js.Object {
  var isSecret: Boolean
  var value: String
}

object VariableValue {
  @scala.inline
  def apply(isSecret: Boolean, value: String): VariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret, value = value)
  
    __obj.asInstanceOf[VariableValue]
  }
}

