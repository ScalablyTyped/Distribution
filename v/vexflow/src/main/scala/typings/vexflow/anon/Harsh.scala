package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Harsh extends js.Object {
  var harsh: Boolean
  var wave_girth: Double
  var wave_height: Double
  var wave_width: Double
}

object Harsh {
  @scala.inline
  def apply(harsh: Boolean, wave_girth: Double, wave_height: Double, wave_width: Double): Harsh = {
    val __obj = js.Dynamic.literal(harsh = harsh.asInstanceOf[js.Any], wave_girth = wave_girth.asInstanceOf[js.Any], wave_height = wave_height.asInstanceOf[js.Any], wave_width = wave_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Harsh]
  }
}

