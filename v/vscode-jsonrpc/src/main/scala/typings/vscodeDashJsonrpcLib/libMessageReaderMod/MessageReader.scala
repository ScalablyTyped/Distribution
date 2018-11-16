package typings
package vscodeDashJsonrpcLib.libMessageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageReader extends js.Object {
  def dispose(): scala.Unit = js.native
  def listen(callback: DataCallback): scala.Unit = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onError(listener: js.Function1[/* e */ nodeLib.Error, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onError(listener: js.Function1[/* e */ nodeLib.Error, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onError(
    listener: js.Function1[/* e */ nodeLib.Error, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}

