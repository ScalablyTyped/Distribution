package typings.webDashPush.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VapidKeys extends js.Object {
  var privateKey: String
  var publicKey: String
}

object VapidKeys {
  @scala.inline
  def apply(privateKey: String, publicKey: String): VapidKeys = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VapidKeys]
  }
}

