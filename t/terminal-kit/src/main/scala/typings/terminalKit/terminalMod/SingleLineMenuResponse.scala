package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleLineMenuResponse extends StObject {
  
  var canceled: Boolean
  
  var selectedIndex: Double
  
  var selectedText: String
  
  var unexpectedKey: String
  
  var x: Double
  
  var y: Double
}
object SingleLineMenuResponse {
  
  inline def apply(
    canceled: Boolean,
    selectedIndex: Double,
    selectedText: String,
    unexpectedKey: String,
    x: Double,
    y: Double
  ): SingleLineMenuResponse = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleLineMenuResponse]
  }
  
  extension [Self <: SingleLineMenuResponse](x: Self) {
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedKey(value: String): Self = StObject.set(x, "unexpectedKey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
