package typings
package tediousLib.tediousMod

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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionAuthentication {
  @scala.inline
  def apply(options: ConnectionAuthenticationOptions, `type`: java.lang.String = null): ConnectionAuthentication = {
    val __obj = js.Dynamic.literal(options = options)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionAuthentication]
  }
}

