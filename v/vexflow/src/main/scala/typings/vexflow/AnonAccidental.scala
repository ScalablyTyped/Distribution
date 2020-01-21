package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccidental extends js.Object {
  var accidental: String
  var code: Double
  var displaced: Boolean
  var int_value: Double
  var key: String
  var line: Double
  var octave: Double
  var shift_right: Double
  var stroke: Double
}

object AnonAccidental {
  @scala.inline
  def apply(
    accidental: String,
    code: Double,
    displaced: Boolean,
    int_value: Double,
    key: String,
    line: Double,
    octave: Double,
    shift_right: Double,
    stroke: Double
  ): AnonAccidental = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], displaced = displaced.asInstanceOf[js.Any], int_value = int_value.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], octave = octave.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccidental]
  }
}

