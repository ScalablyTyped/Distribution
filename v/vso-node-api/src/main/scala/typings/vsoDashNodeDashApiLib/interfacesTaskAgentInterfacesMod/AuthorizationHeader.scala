package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationHeader extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object AuthorizationHeader {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): AuthorizationHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AuthorizationHeader]
  }
}

