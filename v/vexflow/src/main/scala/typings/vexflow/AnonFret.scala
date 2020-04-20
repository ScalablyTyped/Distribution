package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFret extends js.Object {
  var fret: Double
  var str: Double
}

object AnonFret {
  @scala.inline
  def apply(fret: Double, str: Double): AnonFret = {
    val __obj = js.Dynamic.literal(fret = fret.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFret]
  }
}

