package typings
package vscodeDashJsonrpcLib.libMessageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends AbstractMessageReader
     with MessageReader {
  def this(process: nodeLib.NodeJSNs.Process) = this()
  def this(process: nodeLib.childUnderscoreProcessMod.ChildProcess) = this()
  var process: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ stdLib.Error, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ stdLib.Error, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[/* e */ stdLib.Error, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}

