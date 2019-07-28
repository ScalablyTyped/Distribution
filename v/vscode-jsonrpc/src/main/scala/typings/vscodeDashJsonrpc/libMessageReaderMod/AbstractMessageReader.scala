package typings.vscodeDashJsonrpc.libMessageReaderMod

import typings.std.Error
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "AbstractMessageReader")
@js.native
abstract class AbstractMessageReader () extends js.Object {
  var asError: js.Any = js.native
  var closeEmitter: js.Any = js.native
  var errorEmitter: js.Any = js.native
  var partialMessageEmitter: js.Any = js.native
  def dispose(): Unit = js.native
  /* protected */ def fireClose(): Unit = js.native
  /* protected */ def fireError(error: js.Any): Unit = js.native
  /* protected */ def firePartialMessage(info: PartialMessageInfo): Unit = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onError(listener: js.Function1[/* e */ Error, _]): Disposable = js.native
  def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any): Disposable = js.native
  def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): Disposable = js.native
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): Disposable = js.native
  def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}

