package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseWheelParameters extends js.Object {
  var charTranslation: Point = js.native
  var deltaRotationAngle: Double = js.native
  var deltaScale: Double = js.native
  var pageTranslation: Point = js.native
}

object IMouseWheelParameters {
  @scala.inline
  def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): IMouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseWheelParameters]
  }
  @scala.inline
  implicit class IMouseWheelParametersOps[Self <: IMouseWheelParameters] (val x: Self) extends AnyVal {
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
    def setCharTranslation(value: Point): Self = this.set("charTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaRotationAngle(value: Double): Self = this.set("deltaRotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaScale(value: Double): Self = this.set("deltaScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageTranslation(value: Point): Self = this.set("pageTranslation", value.asInstanceOf[js.Any])
  }
  
}

