package typings
package webDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_PublicKey extends js.Object {
  var privateKey: java.lang.String
  var publicKey: java.lang.String
  // should be an object with subject, publicKey and privateKey values defined. These values should follow the VAPID Spec. (https://tools.ietf.org/html/draft-thomson-webpush-vapid)
  var subject: java.lang.String
}

