package typings.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet
  extends /**
  * Indexing with a cell address string maps to a cell object
  * Special keys start with '!'
  */
/* cell */ StringDictionary[CellObject | SheetKeys | js.Any] {
  
  /** Page Margins */
  @JSName("!margins")
  var Exclamationmarkmargins: js.UndefOr[MarginInfo] = js.native
  
  /** Sheet Range */
  @JSName("!ref")
  var Exclamationmarkref: js.UndefOr[String] = js.native
  
  /** Sheet type */
  @JSName("!type")
  var Exclamationmarktype: js.UndefOr[SheetType] = js.native
}
object Sheet {
  
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  @scala.inline
  implicit class SheetMutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclamationmarkmargins(value: MarginInfo): Self = StObject.set(x, "!margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclamationmarkmarginsUndefined: Self = StObject.set(x, "!margins", js.undefined)
    
    @scala.inline
    def setExclamationmarkref(value: String): Self = StObject.set(x, "!ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclamationmarkrefUndefined: Self = StObject.set(x, "!ref", js.undefined)
    
    @scala.inline
    def setExclamationmarktype(value: SheetType): Self = StObject.set(x, "!type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclamationmarktypeUndefined: Self = StObject.set(x, "!type", js.undefined)
  }
}
