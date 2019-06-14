package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Client States for {@link ClientContext.getClientState clientContext.getClientState()}.
  * @see {@link Xrm.ClientState}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.Online
  - xrmLib.xrmLibStrings.Offline
*/
trait ClientState extends js.Object

object ClientState {
  @scala.inline
  def Offline: xrmLib.xrmLibStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: xrmLib.xrmLibStrings.Online = this.cast("Online")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

