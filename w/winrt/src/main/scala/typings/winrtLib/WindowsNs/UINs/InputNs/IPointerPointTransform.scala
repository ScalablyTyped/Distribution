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

