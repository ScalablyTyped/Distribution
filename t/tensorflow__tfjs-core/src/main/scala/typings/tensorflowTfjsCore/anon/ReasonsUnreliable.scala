package typings.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReasonsUnreliable extends js.Object {
  var reasons: js.Array[String]
  var unreliable: Boolean
}

object ReasonsUnreliable {
  @scala.inline
  def apply(reasons: js.Array[String], unreliable: Boolean): ReasonsUnreliable = {
    val __obj = js.Dynamic.literal(reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonsUnreliable]
  }
}

