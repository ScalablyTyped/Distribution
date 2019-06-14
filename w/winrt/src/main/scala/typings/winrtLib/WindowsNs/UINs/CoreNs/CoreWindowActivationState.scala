package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreWindowActivationState extends js.Object

@JSGlobal("Windows.UI.Core.CoreWindowActivationState")
@js.native
object CoreWindowActivationState extends js.Object {
  @js.native
  sealed trait codeActivated
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreWindowActivationState
  
  @js.native
  sealed trait deactivated
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreWindowActivationState
  
  @js.native
  sealed trait pointerActivated
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreWindowActivationState
  
  /* 0 */ val codeActivated: codeActivated with scala.Double = js.native
  /* 1 */ val deactivated: deactivated with scala.Double = js.native
  /* 2 */ val pointerActivated: pointerActivated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreWindowActivationState with scala.Double] = js.native
}

