package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ramda extends js.Object {
  var ramda: js.Function0[scala.Unit] | scala.Null
  var tail: js.Array[_]
}

object Anon_Ramda {
  @scala.inline
  def apply(tail: js.Array[_], ramda: js.Function0[scala.Unit] = null): Anon_Ramda = {
    val __obj = js.Dynamic.literal(tail = tail)
    if (ramda != null) __obj.updateDynamic("ramda")(ramda)
    __obj.asInstanceOf[Anon_Ramda]
  }
}

