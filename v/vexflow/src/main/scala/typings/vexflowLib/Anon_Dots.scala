package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dots extends js.Object {
  var dots: scala.Double
  var duration: java.lang.String
  var `type`: java.lang.String
}

object Anon_Dots {
  @scala.inline
  def apply(dots: scala.Double, duration: java.lang.String, `type`: java.lang.String): Anon_Dots = {
    val __obj = js.Dynamic.literal(dots = dots, duration = duration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Dots]
  }
}

