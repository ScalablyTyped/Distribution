package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireDirectoryOptions extends js.Object {
  var exclude: js.UndefOr[stdLib.RegExp | (js.Function1[/* pathToFile */ java.lang.String, scala.Boolean])] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[stdLib.RegExp | (js.Function1[/* pathToFile */ java.lang.String, scala.Boolean])] = js.undefined
  var recurse: js.UndefOr[scala.Boolean] = js.undefined
  var visit: js.UndefOr[
    js.Function3[
      /* commandObject */ js.Any, 
      /* pathToFile */ js.UndefOr[java.lang.String], 
      /* filename */ js.UndefOr[java.lang.String], 
      _
    ]
  ] = js.undefined
}

object RequireDirectoryOptions {
  @scala.inline
  def apply(
    exclude: stdLib.RegExp | (js.Function1[/* pathToFile */ java.lang.String, scala.Boolean]) = null,
    extensions: js.Array[java.lang.String] = null,
    include: stdLib.RegExp | (js.Function1[/* pathToFile */ java.lang.String, scala.Boolean]) = null,
    recurse: js.UndefOr[scala.Boolean] = js.undefined,
    visit: (/* commandObject */ js.Any, /* pathToFile */ js.UndefOr[java.lang.String], /* filename */ js.UndefOr[java.lang.String]) => _ = null
  ): RequireDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction3(visit))
    __obj.asInstanceOf[RequireDirectoryOptions]
  }
}

