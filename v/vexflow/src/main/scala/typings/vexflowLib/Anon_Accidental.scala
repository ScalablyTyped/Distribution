package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accidental extends js.Object {
  var accidental: java.lang.String
  var code: scala.Double
  var displaced: scala.Boolean
  var int_value: scala.Double
  var key: java.lang.String
  var line: scala.Double
  var octave: scala.Double
  var shift_right: scala.Double
  var stroke: scala.Double
}

object Anon_Accidental {
  @scala.inline
  def apply(
    accidental: java.lang.String,
    code: scala.Double,
    displaced: scala.Boolean,
    int_value: scala.Double,
    key: java.lang.String,
    line: scala.Double,
    octave: scala.Double,
    shift_right: scala.Double,
    stroke: scala.Double
  ): Anon_Accidental = {
    val __obj = js.Dynamic.literal(accidental = accidental, code = code, displaced = displaced, int_value = int_value, key = key, line = line, octave = octave, shift_right = shift_right, stroke = stroke)
  
    __obj.asInstanceOf[Anon_Accidental]
  }
}

