package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromTo extends js.Object {
  var from: js.UndefOr[js.Any] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object Anon_FromTo {
  @scala.inline
  def apply(from: js.Any = null, to: js.Any = null): Anon_FromTo = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_FromTo]
  }
}

