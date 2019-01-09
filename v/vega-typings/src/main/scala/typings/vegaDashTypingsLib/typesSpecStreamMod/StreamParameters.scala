package typings
package vegaDashTypingsLib.typesSpecStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParameters extends js.Object {
  var between: js.UndefOr[js.Array[Stream]] = js.undefined
  var consume: js.UndefOr[scala.Boolean] = js.undefined
  var debounce: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[
    vegaDashTypingsLib.typesSpecExprMod.Expr | js.Array[vegaDashTypingsLib.typesSpecExprMod.Expr]
  ] = js.undefined
  var markname: js.UndefOr[java.lang.String] = js.undefined
  var marktype: js.UndefOr[vegaDashTypingsLib.typesSpecMarktypeMod.MarkType] = js.undefined
  var throttle: js.UndefOr[scala.Double] = js.undefined
}

