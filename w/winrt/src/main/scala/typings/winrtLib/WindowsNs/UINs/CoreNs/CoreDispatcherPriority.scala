package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreDispatcherPriority extends js.Object

@JSGlobal("Windows.UI.Core.CoreDispatcherPriority")
@js.native
object CoreDispatcherPriority extends js.Object {
  @js.native
  sealed trait high
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreDispatcherPriority
  
  @js.native
  sealed trait low
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreDispatcherPriority
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreDispatcherPriority
  
  /* 2 */ val high: high with scala.Double = js.native
  /* 0 */ val low: low with scala.Double = js.native
  /* 1 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreDispatcherPriority with scala.Double] = js.native
}

