package typings.vscodeJsonrpc.messageReaderMod

import typings.std.Error
import typings.vscodeJsonrpc.eventsMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageReader extends js.Object {
  def dispose(): Unit = js.native
  def listen(callback: DataCallback): Unit = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onError(listener: js.Function1[/* e */ Error, _]): Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ Error, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any): Disposable = js.native
  def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): Disposable = js.native
  def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): Disposable = js.native
  def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}

@JSImport("vscode-jsonrpc/lib/messageReader", "MessageReader")
@js.native
object MessageReader extends js.Object {
  def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/messageReader.MessageReader */ Boolean = js.native
}

