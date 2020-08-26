package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accidental extends js.Object {
  var accidental: String = js.native
  var code: Double = js.native
  var displaced: Boolean = js.native
  var int_value: Double = js.native
  var key: String = js.native
  var line: Double = js.native
  var octave: Double = js.native
  var shift_right: Double = js.native
  var stroke: Double = js.native
}

object Accidental {
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
  ): Accidental = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], displaced = displaced.asInstanceOf[js.Any], int_value = int_value.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], octave = octave.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accidental]
  }
  @scala.inline
  implicit class AccidentalOps[Self <: Accidental] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccidental(value: String): Self = this.set("accidental", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplaced(value: Boolean): Self = this.set("displaced", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt_value(value: Double): Self = this.set("int_value", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setOctave(value: Double): Self = this.set("octave", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift_right(value: Double): Self = this.set("shift_right", value.asInstanceOf[js.Any])
    @scala.inline
    def setStroke(value: Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
  }
  
}

