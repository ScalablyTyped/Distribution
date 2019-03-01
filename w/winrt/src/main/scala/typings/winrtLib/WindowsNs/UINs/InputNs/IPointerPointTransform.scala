package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPointTransform extends js.Object {
  var inverse: IPointerPointTransform
  def transformBounds(rect: winrtLib.WindowsNs.FoundationNs.Rect): winrtLib.WindowsNs.FoundationNs.Rect
  def tryTransform(inPoint: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.Anon_OutPoint
}

object IPointerPointTransform {
  @scala.inline
  def apply(
    inverse: IPointerPointTransform,
    transformBounds: js.Function1[winrtLib.WindowsNs.FoundationNs.Rect, winrtLib.WindowsNs.FoundationNs.Rect],
    tryTransform: js.Function1[winrtLib.WindowsNs.FoundationNs.Point, winrtLib.Anon_OutPoint]
  ): IPointerPointTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inverse")(inverse)
    __obj.updateDynamic("transformBounds")(transformBounds)
    __obj.updateDynamic("tryTransform")(tryTransform)
    __obj.asInstanceOf[IPointerPointTransform]
  }
}

