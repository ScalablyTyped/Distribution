package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BpmDots extends js.Object {
  var bpm: scala.Double
  var dots: scala.Double
  var duration: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BpmDots {
  @scala.inline
  def apply(bpm: scala.Double, dots: scala.Double, duration: java.lang.String, name: java.lang.String = null): Anon_BpmDots = {
    val __obj = js.Dynamic.literal(bpm = bpm, dots = dots, duration = duration)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_BpmDots]
  }
}

