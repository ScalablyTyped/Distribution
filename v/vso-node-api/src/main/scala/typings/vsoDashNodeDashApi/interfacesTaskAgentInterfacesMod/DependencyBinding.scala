package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyBinding extends js.Object {
  var key: String
  var value: String
}

object DependencyBinding {
  @scala.inline
  def apply(key: String, value: String): DependencyBinding = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[DependencyBinding]
  }
}

