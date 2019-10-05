package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreDispatcherPriority extends js.Object

@JSGlobal("Windows.UI.Core.CoreDispatcherPriority")
@js.native
object CoreDispatcherPriority extends js.Object {
  @js.native
  sealed trait high extends CoreDispatcherPriority
  
  @js.native
  sealed trait low extends CoreDispatcherPriority
  
  @js.native
  sealed trait normal extends CoreDispatcherPriority
  
  /* 2 */ val high: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.high with Double = js.native
  /* 0 */ val low: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.low with Double = js.native
  /* 1 */ val normal: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreDispatcherPriority with Double] = js.native
}

