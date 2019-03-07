package typings
package tmiDotJsLib.strictDashEventDashEmitterDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverriddenMethods[TEmitter, TEventRecord, TEmitRecord] extends js.Object {
  def addEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def addEventListener[P /* <: java.lang.String */, T](
    `this`: T,
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: ImportType.apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      scala.Unit
    ]
  ): EEMethodReturnType[TEmitter, tmiDotJsLib.tmiDotJsLibStrings.addEventListener, T, scala.Unit] = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def addListener[P /* <: java.lang.String */, T](
    `this`: T,
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: ImportType.apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      scala.Unit
    ]
  ): EEMethodReturnType[TEmitter, tmiDotJsLib.tmiDotJsLibStrings.addListener, T, scala.Unit] = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Unit = js.native
  def emit[P /* <: java.lang.String */, T](
    `this`: T,
    event: P,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ListenerType<TEmitRecord[P]> is not an array type */ args: ListenerType[
      /* import warning: ImportType.apply Failed type conversion: TEmitRecord[P] */ js.Any
    ]
  ): EEMethodReturnType[TEmitter, tmiDotJsLib.tmiDotJsLibStrings.emit, T, scala.Unit] = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def on[P /* <: java.lang.String */, T](
    `this`: T,
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: ImportType.apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      scala.Unit
    ]
  ): EEMethodReturnType[TEmitter, tmiDotJsLib.tmiDotJsLibStrings.on, T, scala.Unit] = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def once[P /* <: java.lang.String */, T](
    `this`: T,
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: ImportType.apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      scala.Unit
    ]
  ): EEMethodReturnType[TEmitter, tmiDotJsLib.tmiDotJsLibStrings.once, T, scala.Unit] = js.native
  def removeEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def removeEventListener[T](`this`: T, event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, _]): EEMethodReturnType[TEmitter, tmiDotJsLib.tmiDotJsLibStrings.removeEventListener, T, scala.Unit] = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def removeListener[T](`this`: T, event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, _]): EEMethodReturnType[TEmitter, tmiDotJsLib.tmiDotJsLibStrings.removeListener, T, scala.Unit] = js.native
}

