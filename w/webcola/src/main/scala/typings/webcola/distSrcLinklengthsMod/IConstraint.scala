package typings.webcola.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraint extends js.Object {
  var gap: Double
  var left: Double
  var right: Double
}

object IConstraint {
  @scala.inline
  def apply(gap: Double, left: Double, right: Double): IConstraint = {
    val __obj = js.Dynamic.literal(gap = gap, left = left, right = right)
  
    __obj.asInstanceOf[IConstraint]
  }
}

