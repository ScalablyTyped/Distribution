package typings.winrt.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PenTipShape extends js.Object

@JSGlobal("Windows.UI.Input.Inking.PenTipShape")
@js.native
object PenTipShape extends js.Object {
  @js.native
  sealed trait circle extends PenTipShape
  
  @js.native
  sealed trait rectangle extends PenTipShape
  
  /* 0 */ val circle: typings.winrt.Windows.UI.Input.Inking.PenTipShape.circle with Double = js.native
  /* 1 */ val rectangle: typings.winrt.Windows.UI.Input.Inking.PenTipShape.rectangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PenTipShape with Double] = js.native
}

