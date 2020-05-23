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
  
}

