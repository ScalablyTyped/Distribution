package typings.umzug.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Down extends js.Object {
  var down: js.UndefOr[js.Function0[js.Thenable[_]]] = js.undefined
  def up(): js.Thenable[_]
}

object Down {
  @scala.inline
  def apply(up: () => js.Thenable[_], down: () => js.Thenable[_] = null): Down = {
    val __obj = js.Dynamic.literal(up = js.Any.fromFunction0(up))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction0(down))
    __obj.asInstanceOf[Down]
  }
}

