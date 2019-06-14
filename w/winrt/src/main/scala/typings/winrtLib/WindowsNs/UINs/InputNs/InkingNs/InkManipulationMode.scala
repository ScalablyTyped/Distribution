package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InkManipulationMode extends js.Object

@JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
@js.native
object InkManipulationMode extends js.Object {
  @js.native
  sealed trait erasing
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode
  
  @js.native
  sealed trait inking
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode
  
  @js.native
  sealed trait selecting
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode
  
  /* 1 */ val erasing: erasing with scala.Double = js.native
  /* 0 */ val inking: inking with scala.Double = js.native
  /* 2 */ val selecting: selecting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode with scala.Double] = js.native
}

