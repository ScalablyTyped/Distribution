package typings
package vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicCredentials extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object IBasicCredentials {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): IBasicCredentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[IBasicCredentials]
  }
}

