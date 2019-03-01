package typings
package universalDashCookieLib.universalDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpts extends js.Object {
  /**
    * do not convert the cookie into an object no matter what
    */
  var doNotParse: scala.Boolean
}

object GetOpts {
  @scala.inline
  def apply(doNotParse: scala.Boolean): GetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doNotParse")(doNotParse)
    __obj.asInstanceOf[GetOpts]
  }
}

