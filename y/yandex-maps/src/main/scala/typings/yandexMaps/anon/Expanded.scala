package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expanded extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
}

object Expanded {
  @scala.inline
  def apply(expanded: js.UndefOr[Boolean] = js.undefined): Expanded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
}

