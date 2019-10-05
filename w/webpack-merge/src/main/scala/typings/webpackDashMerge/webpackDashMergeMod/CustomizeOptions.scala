package typings.webpackDashMerge.webpackDashMergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizeOptions extends js.Object {
  var customizeArray: js.UndefOr[CustomizeArrayFunction | UniqueFunction] = js.undefined
  var customizeObject: js.UndefOr[CustomizeObjectFunction] = js.undefined
}

object CustomizeOptions {
  @scala.inline
  def apply(
    customizeArray: ((/* a */ js.Array[js.Any]) | (/* field */ String), /* b */ js.Array[js.Any | String], (/* keyFn */ js.Function1[/* field */ js.Any, String]) | (/* key */ String)) => js.UndefOr[js.Array[js.Any] | CustomizeArrayFunction | Null] = null,
    customizeObject: (/* a */ js.Object, /* b */ js.Object, /* key */ String) => js.UndefOr[js.Object | Null] = null
  ): CustomizeOptions = {
    val __obj = js.Dynamic.literal()
    if (customizeArray != null) __obj.updateDynamic("customizeArray")(js.Any.fromFunction3(customizeArray))
    if (customizeObject != null) __obj.updateDynamic("customizeObject")(js.Any.fromFunction3(customizeObject))
    __obj.asInstanceOf[CustomizeOptions]
  }
}

