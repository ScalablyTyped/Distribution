package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  var id: String
  var name: String
}

object ProjectReference {
  @scala.inline
  def apply(id: String, name: String): ProjectReference = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[ProjectReference]
  }
}

