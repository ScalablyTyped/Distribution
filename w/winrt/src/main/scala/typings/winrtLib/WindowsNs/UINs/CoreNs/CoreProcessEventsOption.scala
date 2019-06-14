package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreProcessEventsOption extends js.Object

@JSGlobal("Windows.UI.Core.CoreProcessEventsOption")
@js.native
object CoreProcessEventsOption extends js.Object {
  @js.native
  sealed trait processAllIfPresent
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreProcessEventsOption
  
  @js.native
  sealed trait processOneAndAllPending
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreProcessEventsOption
  
  @js.native
  sealed trait processOneIfPresent
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreProcessEventsOption
  
  @js.native
  sealed trait processUntilQuit
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreProcessEventsOption
  
  /* 3 */ val processAllIfPresent: processAllIfPresent with scala.Double = js.native
  /* 0 */ val processOneAndAllPending: processOneAndAllPending with scala.Double = js.native
  /* 1 */ val processOneIfPresent: processOneIfPresent with scala.Double = js.native
  /* 2 */ val processUntilQuit: processUntilQuit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreProcessEventsOption with scala.Double] = js.native
}

