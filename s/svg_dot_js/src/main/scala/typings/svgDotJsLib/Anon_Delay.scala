package typings
package svgDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var ease: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    ease: java.lang.String = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease)
    __obj.asInstanceOf[Anon_Delay]
  }
}

