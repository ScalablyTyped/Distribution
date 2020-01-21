package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.AnonKeyValueAnonKeyValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyData extends js.Object {
  var input: String
  var map: js.Array[AnonKeyValueAnonKeyValueString]
}

object DependencyData {
  @scala.inline
  def apply(input: String, map: js.Array[AnonKeyValueAnonKeyValueString]): DependencyData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DependencyData]
  }
}

