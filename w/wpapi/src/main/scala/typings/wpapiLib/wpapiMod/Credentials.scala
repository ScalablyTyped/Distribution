package typings
package wpapiLib.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Authentication credentials */
trait Credentials extends js.Object {
  /** A WP nonce for use with cookie authentication */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /** A WP-API Basic HTTP Authentication password */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** A WP-API Basic HTTP Authentication username */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    nonce: java.lang.String = null,
    password: java.lang.String = null,
    username: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Credentials]
  }
}

