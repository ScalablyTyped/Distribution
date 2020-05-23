package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Incoming extends js.Object {
  var inProgress: scala.Double
  var incoming: scala.Double
  var outgoing: scala.Double
}

object Incoming {
  @scala.inline
  def apply(inProgress: scala.Double, incoming: scala.Double, outgoing: scala.Double): Incoming = {
    val __obj = js.Dynamic.literal(inProgress = inProgress.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incoming]
  }
}

