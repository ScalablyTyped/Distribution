package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientState extends js.Object

/**
     * Constant Enum: Client States for {@link ClientContext.getClientState clientContext.getClientState()}.
     * @see {@link Xrm.ClientState}
     */
@JSGlobal("XrmEnum.ClientState")
@js.native
object ClientState extends js.Object {
  @js.native
  sealed trait Offline
    extends xrmLib.XrmEnumNs.ClientState
  
  @js.native
  sealed trait Online
    extends xrmLib.XrmEnumNs.ClientState
  
  /* "Offline" */ val Offline: Offline with java.lang.String = js.native
  /* "Online" */ val Online: Online with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.ClientState with java.lang.String] = js.native
}

