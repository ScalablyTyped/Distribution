package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this interface to accept requests from peers to join a session. */
trait IAllJoynAcceptSessionJoiner extends js.Object {
  /** Accept an incoming request to join the session. */
  def accept(): scala.Unit
}

object IAllJoynAcceptSessionJoiner {
  @scala.inline
  def apply(accept: js.Function0[scala.Unit]): IAllJoynAcceptSessionJoiner = {
    val __obj = js.Dynamic.literal(accept = accept)
  
    __obj.asInstanceOf[IAllJoynAcceptSessionJoiner]
  }
}

