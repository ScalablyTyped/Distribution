package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormat extends js.Object {
  
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
  implicit class IFormatOps[Self <: IFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDrawText(value: (IRectangle, String) => js.Any): Self = this.set("drawText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEllipse(value: (Double, Double, Double, Double) => js.Any): Self = this.set("ellipse", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: IFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: IGradient): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: IImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoligon(value: js.Array[IPoint] => js.Any): Self = this.set("poligon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRectangle(value: (Double, Double, Double, Double) => js.Any): Self = this.set("rectangle", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRound(value: IPoint): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: IShadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: IStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextHeight(value: String => Double): Self = this.set("textHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextWidth(value: String => Double): Self = this.set("textWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransparency(value: Double): Self = this.set("transparency", value.asInstanceOf[js.Any])
  }
}
