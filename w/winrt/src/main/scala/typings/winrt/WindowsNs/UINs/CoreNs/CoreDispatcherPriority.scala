package typings.winrt.WindowsNs.UINs.CoreNs

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
  
  /* 2 */ val high: typings.winrt.WindowsNs.UINs.CoreNs.CoreDispatcherPriority.high with Double = js.native
  /* 0 */ val low: typings.winrt.WindowsNs.UINs.CoreNs.CoreDispatcherPriority.low with Double = js.native
  /* 1 */ val normal: typings.winrt.WindowsNs.UINs.CoreNs.CoreDispatcherPriority.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreDispatcherPriority with Double] = js.native
}

