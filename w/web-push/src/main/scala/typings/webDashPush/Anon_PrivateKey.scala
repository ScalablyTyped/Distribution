package typings.webDashPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var privateKey: String
  var publicKey: String
  // should be an object with subject, publicKey and privateKey values defined. These values should follow the VAPID Spec. (https://tools.ietf.org/html/draft-thomson-webpush-vapid)
  var subject: String
}

object Anon_PrivateKey {
  @scala.inline
  def apply(privateKey: String, publicKey: String, subject: String): Anon_PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey, subject = subject)
  
    __obj.asInstanceOf[Anon_PrivateKey]
  }
}

