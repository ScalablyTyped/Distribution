package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scaleMod {
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.scaleMod.RangeEnum
    - typings.vegaTypings.scaleMod.RangeRaw
    - typings.vegaTypings.AnonStep
  */
  type RangeBand = typings.vegaTypings.scaleMod._RangeBand | typings.vegaTypings.scaleMod.RangeRaw
  type RangeRaw = js.Array[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | typings.vegaTypings.signalMod.SignalRef | typings.vegaTypings.scaleMod.RangeRawArray
  ]
  type RangeRawArray = js.Array[scala.Double | typings.vegaTypings.signalMod.SignalRef]
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.scaleMod.RangeEnum
    - typings.vegaTypings.scaleMod.RangeRaw
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.AnonCountExtent
  */
  type RangeScheme = typings.vegaTypings.scaleMod._RangeScheme | typings.vegaTypings.scaleMod.RangeRaw
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | typings.vegaTypings.signalMod.SignalRef]
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.AnonStart
  */
  type ScaleBins = typings.vegaTypings.scaleMod._ScaleBins | (js.Array[scala.Double | typings.vegaTypings.signalMod.SignalRef])
  type ScaleData = (typings.vegaTypings.scaleMod.DataRef with typings.vegaTypings.AnonSort) | (typings.vegaTypings.scaleMod.MultiDataRef with typings.vegaTypings.AnonSortUnionSortField)
  type ScaleField = java.lang.String | typings.vegaTypings.signalMod.SignalRef
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaTypings.AnonOrder
    - typings.vegaTypings.AnonFieldOp
  */
  type SortField = typings.vegaTypings.scaleMod._SortField | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaTypings.AnonCountOp
    - typings.vegaTypings.AnonCountField
  */
  type UnionSortField = typings.vegaTypings.scaleMod._UnionSortField | scala.Boolean
}
