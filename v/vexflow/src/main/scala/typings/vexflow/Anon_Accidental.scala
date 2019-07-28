package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accidental extends js.Object {
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

object Anon_Accidental {
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
  ): Anon_Accidental = {
    val __obj = js.Dynamic.literal(accidental = accidental, code = code, displaced = displaced, int_value = int_value, key = key, line = line, octave = octave, shift_right = shift_right, stroke = stroke)
  
    __obj.asInstanceOf[Anon_Accidental]
  }
}

