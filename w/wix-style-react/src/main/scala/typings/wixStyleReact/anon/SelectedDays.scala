package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesCalendarPanelMod.SelectedDaysType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedDays extends StObject {
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var selectedDays: js.UndefOr[SelectedDaysType] = js.undefined
}
object SelectedDays {
  
  inline def apply(): SelectedDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedDays]
  }
  
  extension [Self <: SelectedDays](x: Self) {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSelectedDays(value: SelectedDaysType): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
    
    inline def setSelectedDaysUndefined: Self = StObject.set(x, "selectedDays", js.undefined)
  }
}
