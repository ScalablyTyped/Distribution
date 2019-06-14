package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreVirtualKeyStates extends js.Object

@JSGlobal("Windows.UI.Core.CoreVirtualKeyStates")
@js.native
object CoreVirtualKeyStates extends js.Object {
  @js.native
  sealed trait down
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreVirtualKeyStates
  
  @js.native
  sealed trait locked
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreVirtualKeyStates
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreVirtualKeyStates
  
  /* 1 */ val down: down with scala.Double = js.native
  /* 2 */ val locked: locked with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreVirtualKeyStates with scala.Double] = js.native
}

