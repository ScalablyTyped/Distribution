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
  
  val processAllIfPresent: processAllIfPresent with java.lang.String = js.native
  val processOneAndAllPending: processOneAndAllPending with java.lang.String = js.native
  val processOneIfPresent: processOneIfPresent with java.lang.String = js.native
  val processUntilQuit: processUntilQuit with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreProcessEventsOption with java.lang.String] = js.native
}

