package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReasonsUnreliable extends js.Object {
  var reasons: js.Array[String]
  var unreliable: Boolean
}

object AnonReasonsUnreliable {
  @scala.inline
  def apply(reasons: js.Array[String], unreliable: Boolean): AnonReasonsUnreliable = {
    val __obj = js.Dynamic.literal(reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReasonsUnreliable]
  }
}

