package typings.wixStyleReact.anon

import typings.wixStyleReact.calendarPanelMod.PresetType
import typings.wixStyleReact.wixStyleReactStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with PresetType {
  
  var value: `-_`
}
object Value {
  
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal(value = "-")
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: `-_`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
