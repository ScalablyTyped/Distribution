package typings.winrt.Windows.UI.Input

import typings.winrt.AnonOutPoint
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPointTransform extends js.Object {
  var inverse: IPointerPointTransform
  def transformBounds(rect: Rect): Rect
  def tryTransform(inPoint: Point): AnonOutPoint
}

object IPointerPointTransform {
  @scala.inline
  def apply(
    inverse: IPointerPointTransform,
    transformBounds: Rect => Rect,
    tryTransform: Point => AnonOutPoint
  ): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
  
    __obj.asInstanceOf[IPointerPointTransform]
  }
}

