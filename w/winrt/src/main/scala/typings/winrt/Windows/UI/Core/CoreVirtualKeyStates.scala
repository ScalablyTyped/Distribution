package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreVirtualKeyStates extends js.Object

@JSGlobal("Windows.UI.Core.CoreVirtualKeyStates")
@js.native
object CoreVirtualKeyStates extends js.Object {
  @js.native
  sealed trait down extends CoreVirtualKeyStates
  
  @js.native
  sealed trait locked extends CoreVirtualKeyStates
  
  @js.native
  sealed trait none extends CoreVirtualKeyStates
  
  /* 1 */ val down: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.down with Double = js.native
  /* 2 */ val locked: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.locked with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreVirtualKeyStates with Double] = js.native
}

