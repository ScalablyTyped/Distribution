package typings.tabris

import typings.tabris.mod.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var transform: js.UndefOr[Transformation] = js.undefined
}

object AnonOpacity {
  @scala.inline
  def apply(opacity: Int | Double = null, transform: Transformation = null): AnonOpacity = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacity]
  }
}

