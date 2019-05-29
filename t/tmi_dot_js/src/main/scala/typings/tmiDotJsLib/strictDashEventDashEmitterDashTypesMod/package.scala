package typings
package tmiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strictDashEventDashEmitterDashTypesMod {
  type EEMethodReturnType[T, S /* <: java.lang.String */, TValue, FValue] = FValue | (InnerEEMethodReturnType[
    /* import warning: ImportType.apply Failed type conversion: T[S] */ js.Any, 
    TValue, 
    FValue
  ])
  type EmitEventNames[TEmitter /* <: TypeRecord[_, _, _] */, TEventRecord /* <: NoUndefined[
    /* import warning: ImportType.apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: ImportType.apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = java.lang.String
  type EventNames[TEmitter /* <: TypeRecord[_, _, _] */, TEventRecord /* <: NoUndefined[
    /* import warning: ImportType.apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: ImportType.apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = java.lang.String
  type InnerEEMethodReturnType[T, TValue, FValue] = FValue | TValue
  type ListenerType[T] = js.Array[js.Any | T]
  type MatchingKeys[TRecord, TMatch, K /* <: java.lang.String */] = K
  type NoUndefined[T] = T
  type OnEventNames[TEmitter /* <: TypeRecord[_, _, _] */, TEventRecord /* <: NoUndefined[
    /* import warning: ImportType.apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: ImportType.apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = java.lang.String
  type OverriddenKeys = java.lang.String
  type ReturnTypeOfMethod[T] = stdLib.ReturnType[T]
  type ReturnTypeOfMethodIfExists[T, S /* <: java.lang.String */] = ReturnTypeOfMethod[/* import warning: ImportType.apply Failed type conversion: T[S] */ js.Any]
  type StrictEventEmitter[TEmitterType, TEventRecord, TEmitRecord, UnneededMethods /* <: stdLib.Exclude[OverriddenKeys, java.lang.String] */, NeededMethods /* <: stdLib.Exclude[OverriddenKeys, UnneededMethods] */] = (TypeRecord[TEmitterType, TEventRecord, TEmitRecord]) with (stdLib.Pick[TEmitterType, stdLib.Exclude[java.lang.String, OverriddenKeys]]) with (stdLib.Pick[OverriddenMethods[TEmitterType, TEventRecord, TEmitRecord], NeededMethods])
  type VoidKeys[Record] = MatchingKeys[Record, scala.Unit, java.lang.String]
}
