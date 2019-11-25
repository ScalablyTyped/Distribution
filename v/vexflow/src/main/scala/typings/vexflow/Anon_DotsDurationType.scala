package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DotsDurationType extends js.Object {
  var dots: js.UndefOr[Double] = js.undefined
  var duration: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_DotsDurationType {
  @scala.inline
  def apply(duration: String, dots: Int | Double = null, `type`: String = null): Anon_DotsDurationType = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DotsDurationType]
  }
}

