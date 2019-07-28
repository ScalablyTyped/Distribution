package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.vscodeDashJsonrpc.libMessagesMod.Message
import typings.vscodeDashJsonrpc.libMessagesMod.ResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStrategy extends js.Object {
  var cancelUndispatched: js.UndefOr[
    js.Function2[
      /* message */ Message, 
      /* next */ js.Function1[/* message */ Message, js.UndefOr[ResponseMessage]], 
      js.UndefOr[ResponseMessage]
    ]
  ] = js.undefined
}

object ConnectionStrategy {
  @scala.inline
  def apply(
    cancelUndispatched: (/* message */ Message, /* next */ js.Function1[/* message */ Message, js.UndefOr[ResponseMessage]]) => js.UndefOr[ResponseMessage] = null
  ): ConnectionStrategy = {
    val __obj = js.Dynamic.literal()
    if (cancelUndispatched != null) __obj.updateDynamic("cancelUndispatched")(js.Any.fromFunction2(cancelUndispatched))
    __obj.asInstanceOf[ConnectionStrategy]
  }
}

