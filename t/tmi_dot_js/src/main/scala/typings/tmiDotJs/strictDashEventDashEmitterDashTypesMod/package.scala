package typings.tmiDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strictDashEventDashEmitterDashTypesMod {
  import typings.std.Exclude
  import typings.std.Pick
  import typings.std.ReturnType

  type EEMethodReturnType[T, S /* <: String */, TValue, FValue] = FValue | (InnerEEMethodReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any, 
    TValue, 
    FValue
  ])
  type EmitEventNames[TEmitter /* <: TypeRecord[_, _, _] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = String
  type EventNames[TEmitter /* <: TypeRecord[_, _, _] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = String
  type InnerEEMethodReturnType[T, TValue, FValue] = FValue | TValue
  type ListenerType[T] = js.Array[js.Any | T]
  type MatchingKeys[TRecord, TMatch, K /* <: String */] = K
  type NoUndefined[T] = T
  type OnEventNames[TEmitter /* <: TypeRecord[_, _, _] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = String
  type OverriddenKeys = String
  type ReturnTypeOfMethod[T] = ReturnType[T]
  type ReturnTypeOfMethodIfExists[T, S /* <: String */] = ReturnTypeOfMethod[
    /* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any
  ]
  type StrictEventEmitter[TEmitterType, TEventRecord, TEmitRecord, UnneededMethods /* <: Exclude[OverriddenKeys, String] */, NeededMethods /* <: Exclude[OverriddenKeys, UnneededMethods] */] = (TypeRecord[TEmitterType, TEventRecord, TEmitRecord]) with (Pick[TEmitterType, Exclude[String, OverriddenKeys]]) with (Pick[OverriddenMethods[TEmitterType, TEventRecord, TEmitRecord], NeededMethods])
  type VoidKeys[Record] = MatchingKeys[Record, Unit, String]
}
