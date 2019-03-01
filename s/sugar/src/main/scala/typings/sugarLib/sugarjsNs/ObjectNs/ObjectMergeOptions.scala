package typings
package sugarLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMergeOptions[T] extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var descriptor: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[scala.Boolean | resolveFn[T]] = js.undefined
}

object ObjectMergeOptions {
  @scala.inline
  def apply[T](
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    descriptor: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: scala.Boolean | resolveFn[T] = null
  ): ObjectMergeOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (!js.isUndefined(descriptor)) __obj.updateDynamic("descriptor")(descriptor)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMergeOptions[T]]
  }
}

