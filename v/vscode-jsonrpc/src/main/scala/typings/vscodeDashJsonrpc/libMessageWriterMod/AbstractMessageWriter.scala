package typings.vscodeDashJsonrpc.libMessageWriterMod

import typings.std.Error
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.libMessagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", "AbstractMessageWriter")
@js.native
abstract class AbstractMessageWriter () extends js.Object {
  var asError: js.Any = js.native
  var closeEmitter: js.Any = js.native
  var errorEmitter: js.Any = js.native
  def dispose(): Unit = js.native
  /* protected */ def fireClose(): Unit = js.native
  /* protected */ def fireError(error: js.Any): Unit = js.native
  /* protected */ def fireError(error: js.Any, message: Message): Unit = js.native
  /* protected */ def fireError(error: js.Any, message: Message, count: Double): Unit = js.native
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
}

