package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFormat extends StObject {
  
  def drawText(bounds: IRectangle, text: String): Any
  
  def ellipse(x: Double, y: Double, width: Double, height: Double): Any
  
  var fill: String
  
  var font: IFont
  
  var gradient: IGradient
  
  var image: IImage
  
  def poligon(points: js.Array[IPoint]): Any
  
  def rectangle(x: Double, y: Double, width: Double, height: Double): Any
  
  var round: IPoint
  
  var shadow: IShadow
  
  var stroke: IStroke
  
  def textHeight(text: String): Double
  
  def textWidth(text: String): Double
  
  var transparency: Double
}
object IFormat {
  
  inline def apply(
    drawText: (IRectangle, String) => Any,
    ellipse: (Double, Double, Double, Double) => Any,
    fill: String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    poligon: js.Array[IPoint] => Any,
    rectangle: (Double, Double, Double, Double) => Any,
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: String => Double,
    textWidth: String => Double,
    transparency: Double
  ): IFormat = {
    val __obj = js.Dynamic.literal(drawText = js.Any.fromFunction2(drawText), ellipse = js.Any.fromFunction4(ellipse), fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], poligon = js.Any.fromFunction1(poligon), rectangle = js.Any.fromFunction4(rectangle), round = round.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], textHeight = js.Any.fromFunction1(textHeight), textWidth = js.Any.fromFunction1(textWidth), transparency = transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormat]
  }
  
  extension [Self <: IFormat](x: Self) {
    
    inline def setDrawText(value: (IRectangle, String) => Any): Self = StObject.set(x, "drawText", js.Any.fromFunction2(value))
    
    inline def setEllipse(value: (Double, Double, Double, Double) => Any): Self = StObject.set(x, "ellipse", js.Any.fromFunction4(value))
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFont(value: IFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: IGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setPoligon(value: js.Array[IPoint] => Any): Self = StObject.set(x, "poligon", js.Any.fromFunction1(value))
    
    inline def setRectangle(value: (Double, Double, Double, Double) => Any): Self = StObject.set(x, "rectangle", js.Any.fromFunction4(value))
    
    inline def setRound(value: IPoint): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: IShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: IStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setTextHeight(value: String => Double): Self = StObject.set(x, "textHeight", js.Any.fromFunction1(value))
    
    inline def setTextWidth(value: String => Double): Self = StObject.set(x, "textWidth", js.Any.fromFunction1(value))
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
  }
}
