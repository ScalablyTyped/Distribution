package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bpm extends js.Object {
  var bpm: Double
  var dots: Boolean
  var duration: String
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Bpm {
  @scala.inline
  def apply(bpm: Double, dots: Boolean, duration: String, name: String = null): Anon_Bpm = {
    val __obj = js.Dynamic.literal(bpm = bpm.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bpm]
  }
}

