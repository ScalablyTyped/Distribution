package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bpm extends js.Object {
  var bpm: scala.Double
  var dots: scala.Boolean
  var duration: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bpm {
  @scala.inline
  def apply(bpm: scala.Double, dots: scala.Boolean, duration: java.lang.String, name: java.lang.String = null): Anon_Bpm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bpm")(bpm)
    __obj.updateDynamic("dots")(dots)
    __obj.updateDynamic("duration")(duration)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Bpm]
  }
}

