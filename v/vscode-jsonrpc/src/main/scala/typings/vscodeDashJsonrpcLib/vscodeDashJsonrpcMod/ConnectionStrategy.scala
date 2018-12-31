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

