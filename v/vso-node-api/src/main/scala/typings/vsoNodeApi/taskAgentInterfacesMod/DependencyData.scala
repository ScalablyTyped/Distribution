package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.anon.KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyData extends js.Object {
  var input: String
  var map: js.Array[KeyString]
}

object DependencyData {
  @scala.inline
  def apply(input: String, map: js.Array[KeyString]): DependencyData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyData]
  }
}

