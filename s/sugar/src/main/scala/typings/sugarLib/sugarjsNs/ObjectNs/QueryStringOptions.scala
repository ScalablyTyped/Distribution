package typings
package sugarLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringOptions[T, U] extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[js.Function3[/* key */ java.lang.String, /* val */ T, /* obj */ js.Object, U]] = js.undefined
}

object QueryStringOptions {
  @scala.inline
  def apply[T, U](
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    separator: java.lang.String = null,
    transform: js.Function3[/* key */ java.lang.String, /* val */ T, /* obj */ js.Object, U] = null
  ): QueryStringOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[QueryStringOptions[T, U]]
  }
}

