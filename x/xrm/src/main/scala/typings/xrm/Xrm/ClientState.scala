package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Client States for {@link ClientContext.getClientState clientContext.getClientState()}.
  * @see {@link XrmEnum.ClientState}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.Online
  - typings.xrm.xrmStrings.Offline
*/
trait ClientState extends js.Object

object ClientState {
  @scala.inline
  def Offline: typings.xrm.xrmStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typings.xrm.xrmStrings.Online = this.cast("Online")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

