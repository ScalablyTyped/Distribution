package typings.wixStyleReact.anon

import typings.wixStyleReact.calendarPanelMod.SelectedDaysType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var selectedDays: js.UndefOr[SelectedDaysType] = js.undefined
}
object Id {
  
  @scala.inline
  def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSelectedDays(value: SelectedDaysType): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDaysUndefined: Self = StObject.set(x, "selectedDays", js.undefined)
  }
}
