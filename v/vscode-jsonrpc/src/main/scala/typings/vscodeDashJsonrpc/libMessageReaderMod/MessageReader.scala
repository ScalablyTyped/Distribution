package typings.vscodeDashJsonrpc.libMessageReaderMod

import typings.std.Error
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageReader extends js.Object {
  def dispose(): Unit = js.native
  def listen(callback: DataCallback): Unit = js.native
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

