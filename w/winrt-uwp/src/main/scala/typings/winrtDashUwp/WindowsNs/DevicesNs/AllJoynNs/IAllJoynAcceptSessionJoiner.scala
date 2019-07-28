package typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this interface to accept requests from peers to join a session. */
trait IAllJoynAcceptSessionJoiner extends js.Object {
  /** Accept an incoming request to join the session. */
  def accept(): Unit
}

object IAllJoynAcceptSessionJoiner {
  @scala.inline
  def apply(accept: () => Unit): IAllJoynAcceptSessionJoiner = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept))
  
    __obj.asInstanceOf[IAllJoynAcceptSessionJoiner]
  }
}

