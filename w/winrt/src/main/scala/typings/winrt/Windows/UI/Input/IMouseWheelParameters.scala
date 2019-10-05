package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseWheelParameters extends js.Object {
  var charTranslation: Point
  var deltaRotationAngle: Double
  var deltaScale: Double
  var pageTranslation: Point
}

object IMouseWheelParameters {
  @scala.inline
  def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): IMouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation, deltaRotationAngle = deltaRotationAngle, deltaScale = deltaScale, pageTranslation = pageTranslation)
  
    __obj.asInstanceOf[IMouseWheelParameters]
  }
}

