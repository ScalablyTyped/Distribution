package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationLine extends js.Object {
  var duration: java.lang.String
  var line: js.UndefOr[scala.Double] = js.undefined
  var text: java.lang.String
}

object Anon_DurationLine {
  @scala.inline
  def apply(duration: java.lang.String, text: java.lang.String, line: scala.Int | scala.Double = null): Anon_DurationLine = {
    val __obj = js.Dynamic.literal(duration = duration, text = text)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DurationLine]
  }
}

