package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoPlacemark extends js.Object {
  var noPlacemark: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_NoPlacemark {
  @scala.inline
  def apply(noPlacemark: js.UndefOr[scala.Boolean] = js.undefined): Anon_NoPlacemark = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noPlacemark)) __obj.updateDynamic("noPlacemark")(noPlacemark)
    __obj.asInstanceOf[Anon_NoPlacemark]
  }
}

