package typings
package webcolaLib.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraint extends js.Object {
  var gap: scala.Double
  var left: scala.Double
  var right: scala.Double
}

object IConstraint {
  @scala.inline
  def apply(gap: scala.Double, left: scala.Double, right: scala.Double): IConstraint = {
    val __obj = js.Dynamic.literal(gap = gap, left = left, right = right)
  
    __obj.asInstanceOf[IConstraint]
  }
}

