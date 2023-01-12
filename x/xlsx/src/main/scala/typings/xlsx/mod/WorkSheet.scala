package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkSheet
  extends StObject
     with Sheet {
  
  /** AutoFilter info */
  @JSName("!autofilter")
  var Exclamationmarkautofilter: js.UndefOr[AutoFilterInfo] = js.undefined
  
  /** Column Info */
  @JSName("!cols")
  var Exclamationmarkcols: js.UndefOr[js.Array[ColInfo]] = js.undefined
  
  /** Merge Ranges */
  @JSName("!merges")
  var Exclamationmarkmerges: js.UndefOr[js.Array[Range]] = js.undefined
  
  /** Worksheet Protection info */
  @JSName("!protect")
  var Exclamationmarkprotect: js.UndefOr[ProtectInfo] = js.undefined
  
  /** Row Info */
  @JSName("!rows")
  var Exclamationmarkrows: js.UndefOr[js.Array[RowInfo]] = js.undefined
}
object WorkSheet {
  
  inline def apply(): WorkSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkSheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkSheet] (val x: Self) extends AnyVal {
    
    inline def setExclamationmarkautofilter(value: AutoFilterInfo): Self = StObject.set(x, "!autofilter", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkautofilterUndefined: Self = StObject.set(x, "!autofilter", js.undefined)
    
    inline def setExclamationmarkcols(value: js.Array[ColInfo]): Self = StObject.set(x, "!cols", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkcolsUndefined: Self = StObject.set(x, "!cols", js.undefined)
    
    inline def setExclamationmarkcolsVarargs(value: ColInfo*): Self = StObject.set(x, "!cols", js.Array(value*))
    
    inline def setExclamationmarkmerges(value: js.Array[Range]): Self = StObject.set(x, "!merges", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkmergesUndefined: Self = StObject.set(x, "!merges", js.undefined)
    
    inline def setExclamationmarkmergesVarargs(value: Range*): Self = StObject.set(x, "!merges", js.Array(value*))
    
    inline def setExclamationmarkprotect(value: ProtectInfo): Self = StObject.set(x, "!protect", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkprotectUndefined: Self = StObject.set(x, "!protect", js.undefined)
    
    inline def setExclamationmarkrows(value: js.Array[RowInfo]): Self = StObject.set(x, "!rows", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkrowsUndefined: Self = StObject.set(x, "!rows", js.undefined)
    
    inline def setExclamationmarkrowsVarargs(value: RowInfo*): Self = StObject.set(x, "!rows", js.Array(value*))
  }
}
