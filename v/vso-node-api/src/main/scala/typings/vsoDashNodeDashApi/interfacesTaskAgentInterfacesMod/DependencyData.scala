package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.vsoDashNodeDashApi.Anon_KeyValueAnonKeyValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyData extends js.Object {
  var input: String
  var map: js.Array[Anon_KeyValueAnonKeyValueString]
}

object DependencyData {
  @scala.inline
  def apply(input: String, map: js.Array[Anon_KeyValueAnonKeyValueString]): DependencyData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DependencyData]
  }
}

