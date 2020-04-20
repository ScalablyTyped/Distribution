package typings.tabris

import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.stretchY
import typings.tabris.tabrisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignment extends js.Object {
  var alignment: js.UndefOr[top | centerY | stretchY | bottom | baseline] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
}

object AnonAlignment {
  @scala.inline
  def apply(alignment: top | centerY | stretchY | bottom | baseline = null, spacing: Int | Double = null): AnonAlignment = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignment]
  }
}

