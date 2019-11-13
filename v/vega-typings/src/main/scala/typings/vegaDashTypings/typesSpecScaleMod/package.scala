package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecScaleMod {
  import typings.vegaDashTypings.Anon_Sort
  import typings.vegaDashTypings.Anon_SortUnionSortField
  import typings.vegaDashTypings.typesSpecSignalMod.SignalRef

  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecScaleMod.RangeEnum
    - typings.vegaDashTypings.typesSpecScaleMod.RangeRaw
    - typings.vegaDashTypings.Anon_Step
  */
  type RangeBand = _RangeBand | RangeRaw
  type RangeRaw = js.Array[Null | Boolean | String | Double | SignalRef | RangeRawArray]
  type RangeRawArray = js.Array[Double | SignalRef]
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecScaleMod.RangeEnum
    - typings.vegaDashTypings.typesSpecScaleMod.RangeRaw
    - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
    - typings.vegaDashTypings.Anon_CountExtent
  */
  type RangeScheme = _RangeScheme | RangeRaw
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | typings.vegaDashTypings.typesSpecSignalMod.SignalRef]
    - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
    - typings.vegaDashTypings.Anon_Start
  */
  type ScaleBins = _ScaleBins | (js.Array[Double | SignalRef])
  type ScaleData = (DataRef with Anon_Sort) | (MultiDataRef with Anon_SortUnionSortField)
  type ScaleField = String | SignalRef
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaDashTypings.Anon_Order
    - typings.vegaDashTypings.Anon_FieldOp
  */
  type SortField = _SortField | Boolean
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaDashTypings.Anon_CountOp
    - typings.vegaDashTypings.Anon_CountField
  */
  type UnionSortField = _UnionSortField | Boolean
}
