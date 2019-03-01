package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccidentalNoteNumber extends js.Object {
  var accidental: scala.Double
  var note: scala.Double
}

object Anon_AccidentalNoteNumber {
  @scala.inline
  def apply(accidental: scala.Double, note: scala.Double): Anon_AccidentalNoteNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accidental")(accidental)
    __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[Anon_AccidentalNoteNumber]
  }
}

