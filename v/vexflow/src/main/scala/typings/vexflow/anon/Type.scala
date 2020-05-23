package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var dots: js.UndefOr[Double] = js.undefined
  var duration: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Type {
  @scala.inline
  def apply(duration: String, dots: js.UndefOr[Double] = js.undefined, `type`: String = null): Type = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

