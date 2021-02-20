package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormat extends StObject {
  
  def drawText(bounds: IRectangle, text: String): js.Any = js.native
  
  def ellipse(x: Double, y: Double, width: Double, height: Double): js.Any = js.native
  
  var fill: String = js.native
  
  var font: IFont = js.native
  
  var gradient: IGradient = js.native
  
  var image: IImage = js.native
  
  def poligon(points: js.Array[IPoint]): js.Any = js.native
  
  def rectangle(x: Double, y: Double, width: Double, height: Double): js.Any = js.native
  
  var round: IPoint = js.native
  
  var shadow: IShadow = js.native
  
  var stroke: IStroke = js.native
  
  def textHeight(text: String): Double = js.native
  
  def textWidth(text: String): Double = js.native
  
  var transparency: Double = js.native
}
object IFormat {
  
  @scala.inline
  def apply(
    drawText: (IRectangle, String) => js.Any,
    ellipse: (Double, Double, Double, Double) => js.Any,
    fill: String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    poligon: js.Array[IPoint] => js.Any,
    rectangle: (Double, Double, Double, Double) => js.Any,
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
  
  @scala.inline
  implicit class IFormatMutableBuilder[Self <: IFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawText(value: (IRectangle, String) => js.Any): Self = StObject.set(x, "drawText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEllipse(value: (Double, Double, Double, Double) => js.Any): Self = StObject.set(x, "ellipse", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: IFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: IGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoligon(value: js.Array[IPoint] => js.Any): Self = StObject.set(x, "poligon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRectangle(value: (Double, Double, Double, Double) => js.Any): Self = StObject.set(x, "rectangle", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRound(value: IPoint): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: IShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: IStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextHeight(value: String => Double): Self = StObject.set(x, "textHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextWidth(value: String => Double): Self = StObject.set(x, "textWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
  }
}
