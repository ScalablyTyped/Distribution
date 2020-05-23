package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panfragment extends js.Object {
  var pan_fragment: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Panfragment {
  @scala.inline
  def apply(pan_fragment: String = null, `type`: String = null): Panfragment = {
    val __obj = js.Dynamic.literal()
    if (pan_fragment != null) __obj.updateDynamic("pan_fragment")(pan_fragment.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panfragment]
  }
}

