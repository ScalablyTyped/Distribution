package typings
package webDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var privateKey: java.lang.String
  var publicKey: java.lang.String
  // should be an object with subject, publicKey and privateKey values defined. These values should follow the VAPID Spec. (https://tools.ietf.org/html/draft-thomson-webpush-vapid)
  var subject: java.lang.String
}

object Anon_PrivateKey {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: java.lang.String, subject: java.lang.String): Anon_PrivateKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Anon_PrivateKey]
  }
}

