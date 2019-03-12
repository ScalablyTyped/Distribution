package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStrategy extends js.Object {
  var cancelUndispatched: js.UndefOr[
    js.Function2[
      /* message */ vscodeDashJsonrpcLib.libMessagesMod.Message, 
      /* next */ js.Function1[
        /* message */ vscodeDashJsonrpcLib.libMessagesMod.Message, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.ResponseMessage]
      ], 
      js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.ResponseMessage]
    ]
  ] = js.undefined
}

object ConnectionStrategy {
  @scala.inline
  def apply(
    cancelUndispatched: (/* message */ vscodeDashJsonrpcLib.libMessagesMod.Message, /* next */ js.Function1[
      /* message */ vscodeDashJsonrpcLib.libMessagesMod.Message, 
      js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.ResponseMessage]
    ]) => js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.ResponseMessage] = null
  ): ConnectionStrategy = {
    val __obj = js.Dynamic.literal()
    if (cancelUndispatched != null) __obj.updateDynamic("cancelUndispatched")(js.Any.fromFunction2(cancelUndispatched))
    __obj.asInstanceOf[ConnectionStrategy]
  }
}

