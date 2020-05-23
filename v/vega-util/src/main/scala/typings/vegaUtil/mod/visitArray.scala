package typings.vegaUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-util", "visitArray")
@js.native
object visitArray extends js.Object {
  def apply(
    array: js.UndefOr[js.Array[_]],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
}

