package typings
package webDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: java.lang.String
  var p256dh: java.lang.String
}

object Anon_Auth {
  @scala.inline
  def apply(auth: java.lang.String, p256dh: java.lang.String): Anon_Auth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("p256dh")(p256dh)
    __obj.asInstanceOf[Anon_Auth]
  }
}

