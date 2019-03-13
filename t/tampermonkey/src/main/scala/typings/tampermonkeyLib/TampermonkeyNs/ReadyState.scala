package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

// Response
@JSGlobal("Tampermonkey.ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait Done
    extends tampermonkeyLib.TampermonkeyNs.ReadyState
  
  @js.native
  sealed trait HeadersReceived
    extends tampermonkeyLib.TampermonkeyNs.ReadyState
  
  @js.native
  sealed trait Loading
    extends tampermonkeyLib.TampermonkeyNs.ReadyState
  
  @js.native
  sealed trait Opened
    extends tampermonkeyLib.TampermonkeyNs.ReadyState
  
  @js.native
  sealed trait Unsent
    extends tampermonkeyLib.TampermonkeyNs.ReadyState
  
  /* 4 */ val Done: Done with scala.Double = js.native
  /* 2 */ val HeadersReceived: HeadersReceived with scala.Double = js.native
  /* 3 */ val Loading: Loading with scala.Double = js.native
  /* 1 */ val Opened: Opened with scala.Double = js.native
  /* 0 */ val Unsent: Unsent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tampermonkeyLib.TampermonkeyNs.ReadyState with scala.Double] = js.native
}

