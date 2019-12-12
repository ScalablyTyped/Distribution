package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processAllIfPresent
import typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneAndAllPending
import typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneIfPresent
import typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processUntilQuit
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreProcessEventsOption with Double] = js.native
  /* 3 */ @js.native
  object processAllIfPresent extends TopLevel[processAllIfPresent with Double]
  
  /* 0 */ @js.native
  object processOneAndAllPending extends TopLevel[processOneAndAllPending with Double]
  
  /* 1 */ @js.native
  object processOneIfPresent extends TopLevel[processOneIfPresent with Double]
  
  /* 2 */ @js.native
  object processUntilQuit extends TopLevel[processUntilQuit with Double]
  
}

