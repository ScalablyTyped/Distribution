package typings.ts3DashNodejsDashLibrary.libTypesContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginInfo extends js.Object {
  var password: String
  var username: String
}

object LoginInfo {
  @scala.inline
  def apply(password: String, username: String): LoginInfo = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginInfo]
  }
}

