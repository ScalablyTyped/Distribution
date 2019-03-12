package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataName extends js.Object {
  var data: js.UndefOr[
    js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* object */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
  var recurse: js.UndefOr[scala.Boolean] = js.undefined
  var signals: js.UndefOr[
    js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* operator */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
}

object Anon_DataName {
  @scala.inline
  def apply(
    data: (/* name */ js.UndefOr[java.lang.String], /* object */ js.UndefOr[js.Any]) => scala.Boolean = null,
    recurse: js.UndefOr[scala.Boolean] = js.undefined,
    signals: (/* name */ js.UndefOr[java.lang.String], /* operator */ js.UndefOr[js.Any]) => scala.Boolean = null
  ): Anon_DataName = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction2(data))
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (signals != null) __obj.updateDynamic("signals")(js.Any.fromFunction2(signals))
    __obj.asInstanceOf[Anon_DataName]
  }
}

