package typings.webcola.linklengthsMod

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
    val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConstraint]
  }
}

