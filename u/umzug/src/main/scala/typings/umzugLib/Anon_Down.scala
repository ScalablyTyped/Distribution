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
  def apply(up: js.Function0[js.Promise[_]], down: js.Function0[js.Promise[_]] = null): Anon_Down = {
    val __obj = js.Dynamic.literal(up = up)
    if (down != null) __obj.updateDynamic("down")(down)
    __obj.asInstanceOf[Anon_Down]
  }
}

