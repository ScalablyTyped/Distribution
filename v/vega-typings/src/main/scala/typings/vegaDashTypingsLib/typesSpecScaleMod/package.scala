package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecScaleMod {
  type DiscreteScaleType = vegaDashTypingsLib.vegaDashTypingsLibStrings.ordinal | vegaDashTypingsLib.vegaDashTypingsLibStrings.band | vegaDashTypingsLib.vegaDashTypingsLibStrings.point
  type DiscretizingScaleType = vegaDashTypingsLib.vegaDashTypingsLibStrings.quantile | vegaDashTypingsLib.vegaDashTypingsLibStrings.quantize | vegaDashTypingsLib.vegaDashTypingsLibStrings.threshold | vegaDashTypingsLib.vegaDashTypingsLibStrings.`bin-ordinal`
  type MultiDataRef = vegaDashTypingsLib.Anon_DataFields | vegaDashTypingsLib.Anon_Fields
  type QuantScaleType = vegaDashTypingsLib.vegaDashTypingsLibStrings.linear | vegaDashTypingsLib.vegaDashTypingsLibStrings.pow | vegaDashTypingsLib.vegaDashTypingsLibStrings.sqrt | vegaDashTypingsLib.vegaDashTypingsLibStrings.log | vegaDashTypingsLib.vegaDashTypingsLibStrings.symlog | vegaDashTypingsLib.vegaDashTypingsLibStrings.time | vegaDashTypingsLib.vegaDashTypingsLibStrings.utc | vegaDashTypingsLib.vegaDashTypingsLibStrings.sequential
  type RangeBand = RangeEnum | RangeRaw | vegaDashTypingsLib.Anon_Step
  type RangeEnum = vegaDashTypingsLib.vegaDashTypingsLibStrings.width | vegaDashTypingsLib.vegaDashTypingsLibStrings.height | vegaDashTypingsLib.vegaDashTypingsLibStrings.symbol | vegaDashTypingsLib.vegaDashTypingsLibStrings.category | vegaDashTypingsLib.vegaDashTypingsLibStrings.ordinal | vegaDashTypingsLib.vegaDashTypingsLibStrings.ramp | vegaDashTypingsLib.vegaDashTypingsLibStrings.diverging | vegaDashTypingsLib.vegaDashTypingsLibStrings.heatmap
  type RangeRaw = js.Array[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ]
  type RangeScheme = RangeEnum | RangeRaw | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.Anon_CountExtent
  type Scale = OrdinalScale | BandScale | PointScale | SequentialScale | TimeScale | IdentityScale | LinearScale | LogScale | SymLogScale | PowScale | SqrtScale | QuantileScale | QuantizeScale | ThresholdScale | BinOrdinalScale
  type ScaleBins = (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.Anon_Start
  type ScaleData = (DataRef with vegaDashTypingsLib.Anon_Sort) | (MultiDataRef with vegaDashTypingsLib.Anon_SortUnionSortField)
  type ScaleField = java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  type ScaleInterpolate = vegaDashTypingsLib.vegaDashTypingsLibStrings.rgb | vegaDashTypingsLib.vegaDashTypingsLibStrings.lab | vegaDashTypingsLib.vegaDashTypingsLibStrings.hcl | vegaDashTypingsLib.vegaDashTypingsLibStrings.hsl | vegaDashTypingsLib.vegaDashTypingsLibStrings.`hsl-long` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`hcl-long` | vegaDashTypingsLib.vegaDashTypingsLibStrings.cubehelix | vegaDashTypingsLib.vegaDashTypingsLibStrings.`cubehelix-long` | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.Anon_Cubehelix
  type ScaleType = QuantScaleType | DiscreteScaleType | DiscretizingScaleType | vegaDashTypingsLib.vegaDashTypingsLibStrings.identity
  type SortField = scala.Boolean | vegaDashTypingsLib.Anon_FieldOp
  type SortOrder = vegaDashTypingsLib.vegaDashTypingsLibStrings.ascending | vegaDashTypingsLib.vegaDashTypingsLibStrings.descending | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  type TimeInterval = vegaDashTypingsLib.vegaDashTypingsLibStrings.millisecond | vegaDashTypingsLib.vegaDashTypingsLibStrings.second | vegaDashTypingsLib.vegaDashTypingsLibStrings.minute | vegaDashTypingsLib.vegaDashTypingsLibStrings.hour | vegaDashTypingsLib.vegaDashTypingsLibStrings.day | vegaDashTypingsLib.vegaDashTypingsLibStrings.week | vegaDashTypingsLib.vegaDashTypingsLibStrings.month | vegaDashTypingsLib.vegaDashTypingsLibStrings.year
  type UnionSortField = scala.Boolean | vegaDashTypingsLib.Anon_CountOp
}
