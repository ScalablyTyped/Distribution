package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.Anon_OutPoint
import typings.winrt.WindowsNs.FoundationNs.Point
import typings.winrt.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPointTransform extends js.Object {
  var inverse: IPointerPointTransform
  def transformBounds(rect: Rect): Rect
  def tryTransform(inPoint: Point): Anon_OutPoint
}

object IPointerPointTransform {
  @scala.inline
  def apply(
    inverse: IPointerPointTransform,
    transformBounds: Rect => Rect,
    tryTransform: Point => Anon_OutPoint
  ): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse, transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
  
    __obj.asInstanceOf[IPointerPointTransform]
  }
}

