package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var line: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(duration: scala.Double, line: scala.Int | scala.Double = null): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Duration]
  }
}

