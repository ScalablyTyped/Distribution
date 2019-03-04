package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VapidKeys extends js.Object {
  var privateKey: java.lang.String
  var publicKey: java.lang.String
}

object VapidKeys {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: java.lang.String): VapidKeys = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[VapidKeys]
  }
}

