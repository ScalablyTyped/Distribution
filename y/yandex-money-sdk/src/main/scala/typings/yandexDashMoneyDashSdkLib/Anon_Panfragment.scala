package typings
package yandexDashMoneyDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Panfragment extends js.Object {
  var pan_fragment: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Panfragment {
  @scala.inline
  def apply(pan_fragment: java.lang.String = null, `type`: java.lang.String = null): Anon_Panfragment = {
    val __obj = js.Dynamic.literal()
    if (pan_fragment != null) __obj.updateDynamic("pan_fragment")(pan_fragment)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Panfragment]
  }
}

