package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DotsDuration extends js.Object {
  var dots: scala.Double
  var duration: java.lang.String
  var ticks: scala.Double
  var `type`: java.lang.String
}

object Anon_DotsDuration {
  @scala.inline
  def apply(dots: scala.Double, duration: java.lang.String, ticks: scala.Double, `type`: java.lang.String): Anon_DotsDuration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("dots")(dots)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("ticks")(ticks)
    __obj.asInstanceOf[Anon_DotsDuration]
  }
}

