package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthSetting extends js.Object {
  var authSetting: Anon_Scopeaddress
}

object Anon_AuthSetting {
  @scala.inline
  def apply(authSetting: Anon_Scopeaddress): Anon_AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authSetting")(authSetting)
    __obj.asInstanceOf[Anon_AuthSetting]
  }
}

