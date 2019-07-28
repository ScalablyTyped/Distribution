package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependsOn extends js.Object {
  var input: String
  var map: js.Array[DependencyBinding]
}

object DependsOn {
  @scala.inline
  def apply(input: String, map: js.Array[DependencyBinding]): DependsOn = {
    val __obj = js.Dynamic.literal(input = input, map = map)
  
    __obj.asInstanceOf[DependsOn]
  }
}

