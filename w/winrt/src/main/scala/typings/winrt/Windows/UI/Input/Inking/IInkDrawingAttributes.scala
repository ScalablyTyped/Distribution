package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkDrawingAttributes extends StObject {
  
  var color: Color
  
  var fitToCurve: Boolean
  
  var ignorePressure: Boolean
  
  var penTip: PenTipShape
  
  var size: Size
}
object IInkDrawingAttributes {
  
  inline def apply(color: Color, fitToCurve: Boolean, ignorePressure: Boolean, penTip: PenTipShape, size: Size): IInkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fitToCurve = fitToCurve.asInstanceOf[js.Any], ignorePressure = ignorePressure.asInstanceOf[js.Any], penTip = penTip.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkDrawingAttributes]
  }
  
  extension [Self <: IInkDrawingAttributes](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFitToCurve(value: Boolean): Self = StObject.set(x, "fitToCurve", value.asInstanceOf[js.Any])
    
    inline def setIgnorePressure(value: Boolean): Self = StObject.set(x, "ignorePressure", value.asInstanceOf[js.Any])
    
    inline def setPenTip(value: PenTipShape): Self = StObject.set(x, "penTip", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
