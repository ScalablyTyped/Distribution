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
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Current]
  }
}

