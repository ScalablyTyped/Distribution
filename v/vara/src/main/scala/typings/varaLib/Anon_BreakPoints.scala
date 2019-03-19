package typings
package varaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreakPoints extends js.Object {
  var breakPoints: js.Array[js.Array[java.lang.String | scala.Double]]
  var width: scala.Double
}

object Anon_BreakPoints {
  @scala.inline
  def apply(breakPoints: js.Array[js.Array[java.lang.String | scala.Double]], width: scala.Double): Anon_BreakPoints = {
    val __obj = js.Dynamic.literal(breakPoints = breakPoints, width = width)
  
    __obj.asInstanceOf[Anon_BreakPoints]
  }
}

