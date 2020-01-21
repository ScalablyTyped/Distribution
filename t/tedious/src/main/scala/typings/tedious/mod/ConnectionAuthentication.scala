package typings.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAuthentication extends js.Object {
  /**
    * Authentication Options
    */
  var options: ConnectionAuthenticationOptions
  /**
    * Authentication Type. Default value is 'default'.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ConnectionAuthentication {
  @scala.inline
  def apply(options: ConnectionAuthenticationOptions, `type`: String = null): ConnectionAuthentication = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAuthentication]
  }
}

