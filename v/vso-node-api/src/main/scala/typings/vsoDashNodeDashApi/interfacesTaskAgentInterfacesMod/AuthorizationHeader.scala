package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationHeader extends js.Object {
  var name: String
  var value: String
}

object AuthorizationHeader {
  @scala.inline
  def apply(name: String, value: String): AuthorizationHeader = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[AuthorizationHeader]
  }
}

