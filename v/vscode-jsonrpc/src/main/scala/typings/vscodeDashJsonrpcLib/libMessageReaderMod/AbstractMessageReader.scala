package typings
package vscodeDashJsonrpcLib.libMessageReaderMod

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
  def dispose(): scala.Unit = js.native
  /* protected */ def fireClose(): scala.Unit = js.native
  /* protected */ def fireError(error: js.Any): scala.Unit = js.native
  /* protected */ def firePartialMessage(info: PartialMessageInfo): scala.Unit = js.native
  def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onError(listener: js.Function1[/* e */ stdLib.Error, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onError(listener: js.Function1[/* e */ stdLib.Error, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ stdLib.Error, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}

