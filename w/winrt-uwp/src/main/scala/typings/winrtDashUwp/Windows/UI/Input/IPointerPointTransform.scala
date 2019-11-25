package typings.winrtDashUwp.Windows.UI.Input

import typings.winrtDashUwp.Anon_OutPoint
import typings.winrtDashUwp.Windows.Foundation.Point
import typings.winrtDashUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides generalized transformation functions. */
trait IPointerPointTransform extends js.Object {
  /** Gets the inverse of the specified transformation. */
  var inverse: IPointerPointTransform
  /**
    * Transforms the specified bounding rectangle.
    * @param rect The bounding rectangle to transform.
    * @return The smallest, axis-aligned bounding box that encloses rect after the transformation. (An axis-aligned bounding box is one which has all sides parallel to the coordinate axes.)
    */
  def transformBounds(rect: Rect): Rect
  /**
    * Attempts to perform the transformation on the specified input point.
    * @param inPoint The original input point.
    */
  def tryTransform(inPoint: Point): Anon_OutPoint
}

object IPointerPointTransform {
  @scala.inline
  def apply(
    inverse: IPointerPointTransform,
    transformBounds: Rect => Rect,
    tryTransform: Point => Anon_OutPoint
  ): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
  
    __obj.asInstanceOf[IPointerPointTransform]
  }
}

