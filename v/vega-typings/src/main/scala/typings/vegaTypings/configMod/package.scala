package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: vega-typings.vega-typings/types/spec/config.ExcludeValueRefKeepSignal<T[P]>}
    */ typings.vegaTypings.vegaTypingsStrings.ExcludeMappedValueRef with T
  type ExcludeValueRefKeepSignal[T] = (typings.std.Exclude[
    T, 
    typings.vegaTypings.encodeMod.ScaledValueRef[js.Any] | typings.vegaTypings.encodeMod.NumericValueRef | typings.vegaTypings.encodeMod.ColorValueRef
  ]) | typings.vegaTypings.configMod.KeepSignal[T]
  type KeepSignal[T] = typings.vegaTypings.signalMod.SignalRef
}
