package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: Double
  var future: Double
  var past: Double
}

object Anon_Current {
  @scala.inline
  def apply(current: Double, future: Double, past: Double): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, future = future, past = past)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

