package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellFontColor extends StObject {
  
  var cellFontColor: js.UndefOr[String] = js.undefined
}
object CellFontColor {
  
  inline def apply(): CellFontColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellFontColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellFontColor] (val x: Self) extends AnyVal {
    
    inline def setCellFontColor(value: String): Self = StObject.set(x, "cellFontColor", value.asInstanceOf[js.Any])
    
    inline def setCellFontColorUndefined: Self = StObject.set(x, "cellFontColor", js.undefined)
  }
}
