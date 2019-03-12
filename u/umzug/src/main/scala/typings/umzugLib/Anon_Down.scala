package typings
package umzugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Down extends js.Object {
  var down: js.UndefOr[js.Function0[js.Promise[_]]] = js.undefined
  def up(): js.Promise[_]
}

object Anon_Down {
  @scala.inline
  def apply(up: () => js.Promise[_], down: () => js.Promise[_] = null): Anon_Down = {
    val __obj = js.Dynamic.literal(up = js.Any.fromFunction0(up))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction0(down))
    __obj.asInstanceOf[Anon_Down]
  }
}

