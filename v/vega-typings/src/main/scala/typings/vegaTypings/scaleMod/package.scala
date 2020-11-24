package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object scaleMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.scaleMod.RangeEnum
    - typings.vegaTypings.scaleMod.RangeRaw
    - typings.vegaTypings.anon.Step
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
    - typings.vegaTypings.anon.Extent
  */
  type RangeScheme = typings.vegaTypings.scaleMod._RangeScheme | typings.vegaTypings.scaleMod.RangeRaw
  
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | typings.vegaTypings.signalMod.SignalRef]
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.scaleMod.ScaleBinParams
  */
  type ScaleBins = typings.vegaTypings.scaleMod._ScaleBins | (js.Array[scala.Double | typings.vegaTypings.signalMod.SignalRef])
  
  type ScaleData = (typings.vegaTypings.scaleMod.ScaleDataRef | typings.vegaTypings.scaleMod.ScaleMultiDataRef | typings.vegaTypings.scaleMod.ScaleMultiFieldsRef) with typings.vegaTypings.anon.Sort
  
  type ScaleField = java.lang.String | typings.vegaTypings.signalMod.SignalRef
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaTypings.anon.OrderSortOrder
    - typings.vegaTypings.anon.Op
  */
  type SortField = typings.vegaTypings.scaleMod._SortField | scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaTypings.anon.OpOrder
    - typings.vegaTypings.anon.FieldOp
  */
  type UnionSortField = typings.vegaTypings.scaleMod._UnionSortField | scala.Boolean
}
