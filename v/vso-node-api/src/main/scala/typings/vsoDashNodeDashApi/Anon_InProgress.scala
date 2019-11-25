package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InProgress extends js.Object {
  var inProgress: Double
  var incoming: Double
  var outgoing: Double
}

object Anon_InProgress {
  @scala.inline
  def apply(inProgress: Double, incoming: Double, outgoing: Double): Anon_InProgress = {
    val __obj = js.Dynamic.literal(inProgress = inProgress.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InProgress]
  }
}

