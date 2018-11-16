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
  
  val erasing: erasing with java.lang.String = js.native
  val inking: inking with java.lang.String = js.native
  val selecting: selecting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode with java.lang.String
  ] = js.native
}

