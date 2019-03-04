package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OutPoint extends js.Object {
  /** The transformed input point. */ var outPoint: winrtDashUwpLib.WindowsNs.FoundationNs.Point
  /** True if inPoint was transformed successfully; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_OutPoint {
  @scala.inline
  def apply(outPoint: winrtDashUwpLib.WindowsNs.FoundationNs.Point, returnValue: scala.Boolean): Anon_OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_OutPoint]
  }
}

