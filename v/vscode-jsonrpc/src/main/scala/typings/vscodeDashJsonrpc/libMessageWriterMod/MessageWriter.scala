package typings.vscodeDashJsonrpc.libMessageWriterMod

import typings.std.Error
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.libMessagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageWriter extends js.Object {
  def dispose(): Unit = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onError(listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _]): Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any
  ): Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def write(msg: Message): Unit = js.native
}

