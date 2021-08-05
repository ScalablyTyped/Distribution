package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundColor extends StObject {
  
  def getBackgroundColor(): String
  
  def getBorderColor(): String
  
  def getBorderRadius(): String
  
  def getBorderStyle(): String
  
  def getBorderWidth(): String
  
  def getContentPadding(): String
}
object GetBackgroundColor {
  
  inline def apply(
    getBackgroundColor: () => String,
    getBorderColor: () => String,
    getBorderRadius: () => String,
    getBorderStyle: () => String,
    getBorderWidth: () => String,
    getContentPadding: () => String
  ): GetBackgroundColor = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction0(getBackgroundColor), getBorderColor = js.Any.fromFunction0(getBorderColor), getBorderRadius = js.Any.fromFunction0(getBorderRadius), getBorderStyle = js.Any.fromFunction0(getBorderStyle), getBorderWidth = js.Any.fromFunction0(getBorderWidth), getContentPadding = js.Any.fromFunction0(getContentPadding))
    __obj.asInstanceOf[GetBackgroundColor]
  }
  
  extension [Self <: GetBackgroundColor](x: Self) {
    
    inline def setGetBackgroundColor(value: () => String): Self = StObject.set(x, "getBackgroundColor", js.Any.fromFunction0(value))
    
    inline def setGetBorderColor(value: () => String): Self = StObject.set(x, "getBorderColor", js.Any.fromFunction0(value))
    
    inline def setGetBorderRadius(value: () => String): Self = StObject.set(x, "getBorderRadius", js.Any.fromFunction0(value))
    
    inline def setGetBorderStyle(value: () => String): Self = StObject.set(x, "getBorderStyle", js.Any.fromFunction0(value))
    
    inline def setGetBorderWidth(value: () => String): Self = StObject.set(x, "getBorderWidth", js.Any.fromFunction0(value))
    
    inline def setGetContentPadding(value: () => String): Self = StObject.set(x, "getContentPadding", js.Any.fromFunction0(value))
  }
}
