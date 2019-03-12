package typings
package vscodeDashJsonrpcLib.libCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellationToken extends js.Object {
  /**
    * Is `true` when the token has been cancelled, `false` otherwise.
    */
  val isCancellationRequested: scala.Boolean = js.native
  /**
    * An [event](#Event) which fires upon cancellation.
    */
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onCancellationRequested(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}

