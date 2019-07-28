package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OutPoint extends js.Object {
  /** The transformed input point. */ var outPoint: Point
  /** True if inPoint was transformed successfully; otherwise, false. */ var returnValue: Boolean
}

object Anon_OutPoint {
  @scala.inline
  def apply(outPoint: Point, returnValue: Boolean): Anon_OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_OutPoint]
  }
}

