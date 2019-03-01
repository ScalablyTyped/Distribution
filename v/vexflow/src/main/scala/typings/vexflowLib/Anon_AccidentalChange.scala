package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccidentalChange extends js.Object {
  var accidental: java.lang.String
  var change: scala.Boolean
  var note: java.lang.String
}

object Anon_AccidentalChange {
  @scala.inline
  def apply(accidental: java.lang.String, change: scala.Boolean, note: java.lang.String): Anon_AccidentalChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accidental")(accidental)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[Anon_AccidentalChange]
  }
}

