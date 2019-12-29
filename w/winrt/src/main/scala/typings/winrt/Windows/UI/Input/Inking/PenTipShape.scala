package typings.winrt.Windows.UI.Input.Inking

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PenTipShape with Double] = js.native
  /* 0 */ @js.native
  object circle extends TopLevel[circle with Double]
  
  /* 1 */ @js.native
  object rectangle extends TopLevel[rectangle with Double]
  
}

