package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OutPoint extends js.Object {
  var outPoint: winrtLib.WindowsNs.FoundationNs.Point
  var returnValue: scala.Boolean
}

object Anon_OutPoint {
  @scala.inline
  def apply(outPoint: winrtLib.WindowsNs.FoundationNs.Point, returnValue: scala.Boolean): Anon_OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_OutPoint]
  }
}

