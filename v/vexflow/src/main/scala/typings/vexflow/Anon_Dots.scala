package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dots extends js.Object {
  var dots: Double
  var duration: String
  var `type`: String
}

object Anon_Dots {
  @scala.inline
  def apply(dots: Double, duration: String, `type`: String): Anon_Dots = {
    val __obj = js.Dynamic.literal(dots = dots, duration = duration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Dots]
  }
}

