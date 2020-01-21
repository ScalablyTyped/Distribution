package typings.vscodeJsonrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]], 
    typings.vscodeJsonrpc.eventsMod.Disposable
  ]
}
