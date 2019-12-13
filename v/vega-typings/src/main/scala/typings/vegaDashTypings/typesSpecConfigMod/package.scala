package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecConfigMod {
  import typings.std.Exclude
  import typings.std.Record
  import typings.vegaDashTypings.typesSpecAxisMod.BaseAxis
  import typings.vegaDashTypings.typesSpecEncodeMod.ColorValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.NumericValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.ScaledValueRef
  import typings.vegaDashTypings.typesSpecProjectionMod.BaseProjection
  import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
  import typings.vegaDashTypings.typesSpecStreamMod.EventType
  import typings.vegaDashTypings.typesSpecTitleMod.BaseTitle
  import typings.vegaDashTypings.vegaDashTypingsStrings.allow
  import typings.vegaDashTypings.vegaDashTypingsStrings.mark
  import typings.vegaDashTypings.vegaDashTypingsStrings.prevent

  type AxisConfig = ExcludeMappedValueRef[BaseAxis]
  type DefaultsConfig = Record[prevent | allow, Boolean | js.Array[EventType]]
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: vega-typings.vega-typings/types/spec/config.ExcludeValueRefKeepSignal<T[P]>}
    */ typings.vegaDashTypings.vegaDashTypingsStrings.ExcludeMappedValueRef with T
  type ExcludeValueRefKeepSignal[T] = (Exclude[T, ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[T]
  type KeepSignal[T] = SignalRef
  type MarkConfigKeys = mark | (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
  type ProjectionConfig = ExcludeMappedValueRef[BaseProjection]
  type TitleConfig = ExcludeMappedValueRef[BaseTitle]
}
