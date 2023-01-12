package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellPlusColor extends StObject {
  
  var cellPlusColor: js.UndefOr[String] = js.undefined
  
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
}
object CellPlusColor {
  
  inline def apply(): CellPlusColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPlusColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellPlusColor] (val x: Self) extends AnyVal {
    
    inline def setCellPlusColor(value: String): Self = StObject.set(x, "cellPlusColor", value.asInstanceOf[js.Any])
    
    inline def setCellPlusColorUndefined: Self = StObject.set(x, "cellPlusColor", js.undefined)
    
    inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
  }
}
