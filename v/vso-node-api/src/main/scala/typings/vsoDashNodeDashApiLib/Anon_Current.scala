package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: scala.Double
  var future: scala.Double
  var past: scala.Double
}

object Anon_Current {
  @scala.inline
  def apply(current: scala.Double, future: scala.Double, past: scala.Double): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, future = future, past = past)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

