package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/util/object", JSImport.Namespace)
@js.native
object outUtilObjectMod extends js.Object {
  def asyncArrayFilter[T](
    arr: js.Array[T],
    callback: js.Function3[/* item */ T, /* index */ Double, /* arr */ js.Array[T], Boolean | js.Promise[Boolean]]
  ): js.Promise[js.Array[T]] = js.native
  def filter(
    `object`: js.Any,
    filter: js.Function3[/* value */ js.Any, /* key */ String, /* object */ js.Object, Boolean]
  ): js.Object = js.native
}

