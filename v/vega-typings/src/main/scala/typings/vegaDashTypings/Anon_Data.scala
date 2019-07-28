package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  var recurse: js.UndefOr[Boolean] = js.undefined
  var signals: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    data: (/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any]) => Boolean = null,
    recurse: js.UndefOr[Boolean] = js.undefined,
    signals: (/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any]) => Boolean = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction2(data))
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (signals != null) __obj.updateDynamic("signals")(js.Any.fromFunction2(signals))
    __obj.asInstanceOf[Anon_Data]
  }
}

