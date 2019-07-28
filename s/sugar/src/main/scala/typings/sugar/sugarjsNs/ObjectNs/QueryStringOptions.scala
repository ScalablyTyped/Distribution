package typings.sugar.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringOptions[T, U] extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function3[/* key */ String, /* val */ T, /* obj */ js.Object, U]] = js.undefined
}

object QueryStringOptions {
  @scala.inline
  def apply[T, U](
    deep: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    separator: String = null,
    transform: (/* key */ String, /* val */ T, /* obj */ js.Object) => U = null
  ): QueryStringOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    __obj.asInstanceOf[QueryStringOptions[T, U]]
  }
}

