package typings
package wpapiLib.wpapiMod.WPAPINs

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

