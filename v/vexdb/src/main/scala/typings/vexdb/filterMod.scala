package typings.vexdb

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/util/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def default(`object`: js.Object, key: String, filt: Filter): js.Promise[Boolean] = js.native
  type Filter = RegExp | (js.Array[Double | String]) | FilterFunction | Double | String
  type FilterFunction = js.Function2[/* val */ js.Any, /* object */ js.Object, js.Promise[Boolean] | Boolean]
}

