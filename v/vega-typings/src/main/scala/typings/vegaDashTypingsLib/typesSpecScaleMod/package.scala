package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecScaleMod {
  /* Rewritten from type alias, can be one of: 
    - RangeEnum
    - RangeRaw
    - vegaDashTypingsLib.Anon_Step
  */
  type RangeBand = _RangeBand | RangeRaw
  type RangeRaw = js.Array[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RangeRawArray
  ]
  type RangeRawArray = js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
  /* Rewritten from type alias, can be one of: 
    - RangeEnum
    - RangeRaw
    - vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    - vegaDashTypingsLib.Anon_CountExtent
  */
  type RangeScheme = _RangeScheme | RangeRaw
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
    - vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    - vegaDashTypingsLib.Anon_Start
  */
  type ScaleBins = _ScaleBins | (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef])
  type ScaleData = (DataRef with vegaDashTypingsLib.Anon_Sort) | (MultiDataRef with vegaDashTypingsLib.Anon_SortUnionSortField)
  type ScaleField = java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  type SortField = scala.Boolean | vegaDashTypingsLib.Anon_FieldOp
  type UnionSortField = scala.Boolean | vegaDashTypingsLib.Anon_CountOp
}
