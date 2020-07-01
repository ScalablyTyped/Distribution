package typings.tapable.anon

import typings.tapable.mod.TapFunction
import typings.tapable.tapableStrings.async
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[TArg1, TArg2, TArg3, THookResult] extends js.Object {
  var fn: js.UndefOr[TapFunction[async, TArg1, TArg2, TArg3, THookResult]] = js.undefined
  var `type`: js.UndefOr[async] = js.undefined
}

object Type {
  @scala.inline
  def apply[TArg1, TArg2, TArg3, THookResult](
    fn: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit = null,
    `type`: async = null
  ): Type[TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction4(fn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[TArg1, TArg2, TArg3, THookResult]]
  }
}

