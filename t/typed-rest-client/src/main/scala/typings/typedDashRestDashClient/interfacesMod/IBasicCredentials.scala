package typings.typedDashRestDashClient.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicCredentials extends js.Object {
  var password: String
  var username: String
}

object IBasicCredentials {
  @scala.inline
  def apply(password: String, username: String): IBasicCredentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[IBasicCredentials]
  }
}

