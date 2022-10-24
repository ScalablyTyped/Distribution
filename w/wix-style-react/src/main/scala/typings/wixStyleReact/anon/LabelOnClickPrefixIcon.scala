package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesTimeTableMod.TimeTableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOnClickPrefixIcon extends StObject {
  
  var label: String
  
  def onClick(e: typings.std.Event, item: TimeTableColumn, index: Double): Unit
  
  var prefixIcon: js.UndefOr[ReactNode] = js.undefined
}
object LabelOnClickPrefixIcon {
  
  inline def apply(label: String, onClick: (typings.std.Event, TimeTableColumn, Double) => Unit): LabelOnClickPrefixIcon = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[LabelOnClickPrefixIcon]
  }
  
  extension [Self <: LabelOnClickPrefixIcon](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: (typings.std.Event, TimeTableColumn, Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setPrefixIcon(value: ReactNode): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
    
    inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
  }
}
