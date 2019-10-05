package typings.vegaDashTypings.typesRuntimeMod

import typings.vegaDashUtil.vegaDashUtilMod.AccessorFn
import typings.vegaDashUtil.vegaDashUtilMod.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "compare")
@js.native
object compare extends js.Object {
  def apply(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: js.Array[AccessorFn[_] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: js.Array[AccessorFn[_] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: js.Array[AccessorFn[_] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: AccessorFn[_], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def apply(fields: AccessorFn[_], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
}

