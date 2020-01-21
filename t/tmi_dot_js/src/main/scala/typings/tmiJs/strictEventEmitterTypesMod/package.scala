package typings.tmiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strictEventEmitterTypesMod {
  type EEMethodReturnType[T, S /* <: java.lang.String */, TValue, FValue] = FValue | (typings.tmiJs.strictEventEmitterTypesMod.InnerEEMethodReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any, 
    TValue, 
    FValue
  ])
  type EmitEventNames[TEmitter /* <: typings.tmiJs.strictEventEmitterTypesMod.TypeRecord[_, _, _] */, TEventRecord /* <: typings.tmiJs.strictEventEmitterTypesMod.NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: typings.tmiJs.strictEventEmitterTypesMod.NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = java.lang.String
  type EventNames[TEmitter /* <: typings.tmiJs.strictEventEmitterTypesMod.TypeRecord[_, _, _] */, TEventRecord /* <: typings.tmiJs.strictEventEmitterTypesMod.NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: typings.tmiJs.strictEventEmitterTypesMod.NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = java.lang.String
  type InnerEEMethodReturnType[T, TValue, FValue] = FValue | TValue
  type ListenerType[T] = js.Array[js.Any | T]
  type MatchingKeys[TRecord, TMatch, K /* <: java.lang.String */] = K
  type NoUndefined[T] = T
  type OnEventNames[TEmitter /* <: typings.tmiJs.strictEventEmitterTypesMod.TypeRecord[_, _, _] */, TEventRecord /* <: typings.tmiJs.strictEventEmitterTypesMod.NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: typings.tmiJs.strictEventEmitterTypesMod.NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = java.lang.String
  type OverriddenKeys = java.lang.String
  type ReturnTypeOfMethod[T] = typings.std.ReturnType[T]
  type ReturnTypeOfMethodIfExists[T, S /* <: java.lang.String */] = typings.tmiJs.strictEventEmitterTypesMod.ReturnTypeOfMethod[
    /* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any
  ]
  type StrictEventEmitter[TEmitterType, TEventRecord, TEmitRecord, UnneededMethods /* <: typings.std.Exclude[typings.tmiJs.strictEventEmitterTypesMod.OverriddenKeys, java.lang.String] */, NeededMethods /* <: typings.std.Exclude[typings.tmiJs.strictEventEmitterTypesMod.OverriddenKeys, UnneededMethods] */] = (typings.tmiJs.strictEventEmitterTypesMod.TypeRecord[TEmitterType, TEventRecord, TEmitRecord]) with (typings.std.Pick[
    TEmitterType, 
    typings.std.Exclude[java.lang.String, typings.tmiJs.strictEventEmitterTypesMod.OverriddenKeys]
  ]) with (typings.std.Pick[
    typings.tmiJs.strictEventEmitterTypesMod.OverriddenMethods[TEmitterType, TEventRecord, TEmitRecord], 
    NeededMethods
  ])
  type VoidKeys[Record] = typings.tmiJs.strictEventEmitterTypesMod.MatchingKeys[Record, scala.Unit, java.lang.String]
}
