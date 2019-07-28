package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineMarginItem extends js.Object {
  var horizontal: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Double] = js.undefined
}

object TimelineMarginItem {
  @scala.inline
  def apply(horizontal: Int | Double = null, vertical: Int | Double = null): TimelineMarginItem = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineMarginItem]
  }
}

