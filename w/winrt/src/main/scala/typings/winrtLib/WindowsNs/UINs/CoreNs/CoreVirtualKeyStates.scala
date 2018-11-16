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
  
  val down: down with java.lang.String = js.native
  val locked: locked with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreVirtualKeyStates with java.lang.String] = js.native
}

