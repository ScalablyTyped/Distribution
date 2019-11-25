package typings.sugar.sugarjs.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMergeOptions[T] extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var descriptor: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var resolve: js.UndefOr[Boolean | resolveFn[T]] = js.undefined
}

object ObjectMergeOptions {
  @scala.inline
  def apply[T](
    deep: js.UndefOr[Boolean] = js.undefined,
    descriptor: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    resolve: Boolean | resolveFn[T] = null
  ): ObjectMergeOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptor)) __obj.updateDynamic("descriptor")(descriptor.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMergeOptions[T]]
  }
}

