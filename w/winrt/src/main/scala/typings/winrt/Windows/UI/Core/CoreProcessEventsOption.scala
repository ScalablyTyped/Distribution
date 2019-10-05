package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreProcessEventsOption extends js.Object

@JSGlobal("Windows.UI.Core.CoreProcessEventsOption")
@js.native
object CoreProcessEventsOption extends js.Object {
  @js.native
  sealed trait processAllIfPresent extends CoreProcessEventsOption
  
  @js.native
  sealed trait processOneAndAllPending extends CoreProcessEventsOption
  
  @js.native
  sealed trait processOneIfPresent extends CoreProcessEventsOption
  
  @js.native
  sealed trait processUntilQuit extends CoreProcessEventsOption
  
  /* 3 */ val processAllIfPresent: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processAllIfPresent with Double = js.native
  /* 0 */ val processOneAndAllPending: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneAndAllPending with Double = js.native
  /* 1 */ val processOneIfPresent: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneIfPresent with Double = js.native
  /* 2 */ val processUntilQuit: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processUntilQuit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreProcessEventsOption with Double] = js.native
}

