package typings.xlsx.mod

import typings.xlsx.xlsxNumbers.`0`
import typings.xlsx.xlsxNumbers.`1`
import typings.xlsx.xlsxNumbers.`2`
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
  
  @scala.inline
  def apply(): SheetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetProps]
  }
  
  @scala.inline
  implicit class SheetPropsMutableBuilder[Self <: SheetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeName(value: String): Self = StObject.set(x, "CodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNameUndefined: Self = StObject.set(x, "CodeName", js.undefined)
    
    @scala.inline
    def setHidden(value: `0` | `1` | `2`): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "Hidden", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
