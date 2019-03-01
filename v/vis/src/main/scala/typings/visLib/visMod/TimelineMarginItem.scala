package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineMarginItem extends js.Object {
  var horizontal: js.UndefOr[scala.Double] = js.undefined
  var vertical: js.UndefOr[scala.Double] = js.undefined
}

object TimelineMarginItem {
  @scala.inline
  def apply(horizontal: scala.Int | scala.Double = null, vertical: scala.Int | scala.Double = null): TimelineMarginItem = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineMarginItem]
  }
}

