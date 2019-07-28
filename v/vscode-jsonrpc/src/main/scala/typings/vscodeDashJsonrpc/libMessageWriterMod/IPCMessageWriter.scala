package typings.vscodeDashJsonrpc.libMessageWriterMod

import typings.node.NodeJSNs.Process
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.std.Error
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.libMessagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends AbstractMessageWriter
     with MessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
  var errorCount: js.Any = js.native
  var process: js.Any = js.native
  var queue: js.Any = js.native
  var sending: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  def doWriteMessage(msg: Message): Unit = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any
  ): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}

