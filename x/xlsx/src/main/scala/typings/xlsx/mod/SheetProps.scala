package typings.xlsx.mod

import typings.xlsx.xlsxInts.`0`
import typings.xlsx.xlsxInts.`1`
import typings.xlsx.xlsxInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetProps extends StObject {
  
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.undefined
  
  /** Sheet Visibility (0=Visible 1=Hidden 2=VeryHidden) */
  var Hidden: js.UndefOr[`0` | `1` | `2`] = js.undefined
  
  /** Name of Sheet */
  var name: js.UndefOr[String] = js.undefined
}
object SheetProps {
  
  inline def apply(): SheetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetProps] (val x: Self) extends AnyVal {
    
    inline def setCodeName(value: String): Self = StObject.set(x, "CodeName", value.asInstanceOf[js.Any])
    
    inline def setCodeNameUndefined: Self = StObject.set(x, "CodeName", js.undefined)
    
    inline def setHidden(value: `0` | `1` | `2`): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "Hidden", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
