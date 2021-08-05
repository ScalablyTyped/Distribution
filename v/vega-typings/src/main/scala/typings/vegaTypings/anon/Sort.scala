package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort extends StObject {
  
  var sort: js.UndefOr[SortField] = js.undefined
}
object Sort {
  
  inline def apply(): Sort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sort]
  }
  
  extension [Self <: Sort](x: Self) {
    
    inline def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
