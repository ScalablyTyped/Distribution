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
  
  val codeActivated: codeActivated with java.lang.String = js.native
  val deactivated: deactivated with java.lang.String = js.native
  val pointerActivated: pointerActivated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreWindowActivationState with java.lang.String] = js.native
}

