package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ramda extends js.Object {
  var ramda: js.Function0[Unit] | Null
  var tail: js.Array[_]
}

object Anon_Ramda {
  @scala.inline
  def apply(tail: js.Array[_], ramda: () => Unit = null): Anon_Ramda = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any])
    if (ramda != null) __obj.updateDynamic("ramda")(js.Any.fromFunction0(ramda))
    __obj.asInstanceOf[Anon_Ramda]
  }
}

