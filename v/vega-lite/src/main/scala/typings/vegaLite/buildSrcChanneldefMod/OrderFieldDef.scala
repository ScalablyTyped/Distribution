package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcSortMod.SortOrder
import typings.vegaLite.buildSrcTypeMod.StandardType
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderFieldDef[F /* <: Field */]
  extends StObject
     with TypedFieldDef[F, StandardType, Boolean | BinParams | binned | Null]
     with _ChannelDef[F] {
  
  /**
    * The sort order. One of `"ascending"` (default) or `"descending"`.
    */
  var sort: js.UndefOr[SortOrder] = js.undefined
}
object OrderFieldDef {
  
  inline def apply[F /* <: Field */](): OrderFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderFieldDef[F]]
  }
  
  extension [Self <: OrderFieldDef[?], F /* <: Field */](x: Self & OrderFieldDef[F]) {
    
    inline def setSort(value: SortOrder): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
