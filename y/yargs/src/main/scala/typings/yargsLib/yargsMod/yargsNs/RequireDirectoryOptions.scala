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

