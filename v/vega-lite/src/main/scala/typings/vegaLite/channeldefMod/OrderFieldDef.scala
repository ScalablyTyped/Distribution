package typings.vegaLite.channeldefMod

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.sortMod.SortOrder
import typings.vegaLite.srcTypeMod.StandardType
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
  
  @scala.inline
  def apply[F /* <: Field */](): OrderFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderFieldDef[F]]
  }
  
  @scala.inline
  implicit class OrderFieldDefMutableBuilder[Self <: OrderFieldDef[?], F /* <: Field */] (val x: Self & OrderFieldDef[F]) extends AnyVal {
    
    @scala.inline
    def setSort(value: SortOrder): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
