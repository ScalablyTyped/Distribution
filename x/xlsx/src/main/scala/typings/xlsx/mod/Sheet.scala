package typings.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet
  extends StObject
     with /**
  * Indexing with a cell address string maps to a cell object
  * Special keys start with '!'
  */
/* cell */ StringDictionary[CellObject | SheetKeys | Any] {
  
  /** Page Margins */
  @JSName("!margins")
  var Exclamationmarkmargins: js.UndefOr[MarginInfo] = js.undefined
  
  /** Sheet Range */
  @JSName("!ref")
  var Exclamationmarkref: js.UndefOr[String] = js.undefined
  
  /** Sheet type */
  @JSName("!type")
  var Exclamationmarktype: js.UndefOr[SheetType] = js.undefined
}
object Sheet {
  
  inline def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
    
    inline def setExclamationmarkmargins(value: MarginInfo): Self = StObject.set(x, "!margins", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkmarginsUndefined: Self = StObject.set(x, "!margins", js.undefined)
    
    inline def setExclamationmarkref(value: String): Self = StObject.set(x, "!ref", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkrefUndefined: Self = StObject.set(x, "!ref", js.undefined)
    
    inline def setExclamationmarktype(value: SheetType): Self = StObject.set(x, "!type", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarktypeUndefined: Self = StObject.set(x, "!type", js.undefined)
  }
}
