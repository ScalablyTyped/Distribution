package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellPlusColor extends StObject {
  
  var cellPlusColor: js.UndefOr[String] = js.undefined
  
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
}
object CellPlusColor {
  
  @scala.inline
  def apply(): CellPlusColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPlusColor]
  }
  
  @scala.inline
  implicit class CellPlusColorMutableBuilder[Self <: CellPlusColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellPlusColor(value: String): Self = StObject.set(x, "cellPlusColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPlusColorUndefined: Self = StObject.set(x, "cellPlusColor", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
  }
}
