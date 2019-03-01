package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

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
  def transformBounds(rect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): winrtDashUwpLib.WindowsNs.FoundationNs.Rect
  /**
    * Attempts to perform the transformation on the specified input point.
    * @param inPoint The original input point.
    */
  def tryTransform(inPoint: winrtDashUwpLib.WindowsNs.FoundationNs.Point): winrtDashUwpLib.Anon_OutPoint
}

object IPointerPointTransform {
  @scala.inline
  def apply(
    inverse: IPointerPointTransform,
    transformBounds: js.Function1[
      winrtDashUwpLib.WindowsNs.FoundationNs.Rect, 
      winrtDashUwpLib.WindowsNs.FoundationNs.Rect
    ],
    tryTransform: js.Function1[winrtDashUwpLib.WindowsNs.FoundationNs.Point, winrtDashUwpLib.Anon_OutPoint]
  ): IPointerPointTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inverse")(inverse)
    __obj.updateDynamic("transformBounds")(transformBounds)
    __obj.updateDynamic("tryTransform")(tryTransform)
    __obj.asInstanceOf[IPointerPointTransform]
  }
}

