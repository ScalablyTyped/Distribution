package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var bpm: Double
  var dots: Boolean
  var duration: String
  var name: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(bpm: Double, dots: Boolean, duration: String, name: String = null): Name = {
    val __obj = js.Dynamic.literal(bpm = bpm.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

