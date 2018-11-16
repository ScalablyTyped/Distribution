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
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreDispatcherPriority with java.lang.String] = js.native
}

