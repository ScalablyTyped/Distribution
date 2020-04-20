package typings.tabris

import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.stretchX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpacing extends js.Object {
  var alignment: js.UndefOr[left | centerX | stretchX | right] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
}

object AnonSpacing {
  @scala.inline
  def apply(alignment: left | centerX | stretchX | right = null, spacing: Int | Double = null): AnonSpacing = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpacing]
  }
}

