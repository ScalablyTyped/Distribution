package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkDrawingAttributes extends js.Object {
  var color: Color = js.native
  var fitToCurve: Boolean = js.native
  var ignorePressure: Boolean = js.native
  var penTip: PenTipShape = js.native
  var size: Size = js.native
}

object IInkDrawingAttributes {
  @scala.inline
  def apply(color: Color, fitToCurve: Boolean, ignorePressure: Boolean, penTip: PenTipShape, size: Size): IInkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fitToCurve = fitToCurve.asInstanceOf[js.Any], ignorePressure = ignorePressure.asInstanceOf[js.Any], penTip = penTip.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkDrawingAttributes]
  }
  @scala.inline
  implicit class IInkDrawingAttributesOps[Self <: IInkDrawingAttributes] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFitToCurve(value: Boolean): Self = this.set("fitToCurve", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnorePressure(value: Boolean): Self = this.set("ignorePressure", value.asInstanceOf[js.Any])
    @scala.inline
    def setPenTip(value: PenTipShape): Self = this.set("penTip", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

