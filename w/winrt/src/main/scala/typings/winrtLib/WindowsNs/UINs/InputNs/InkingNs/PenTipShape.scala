package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PenTipShape extends js.Object

@JSGlobal("Windows.UI.Input.Inking.PenTipShape")
@js.native
object PenTipShape extends js.Object {
  @js.native
  sealed trait circle
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape
  
  @js.native
  sealed trait rectangle
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape
  
  val circle: circle with java.lang.String = js.native
  val rectangle: rectangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape with java.lang.String] = js.native
}

