package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dots extends js.Object {
  var dots: Double
  var duration: String
  var `type`: String
}

object Dots {
  @scala.inline
  def apply(dots: Double, duration: String, `type`: String): Dots = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dots]
  }
}

