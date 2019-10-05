package typings.winrt.Windows.Graphics.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResolutionScale extends js.Object

@JSGlobal("Windows.Graphics.Display.ResolutionScale")
@js.native
object ResolutionScale extends js.Object {
  @js.native
  sealed trait invalid extends ResolutionScale
  
  @js.native
  sealed trait scale100Percent extends ResolutionScale
  
  @js.native
  sealed trait scale140Percent extends ResolutionScale
  
  @js.native
  sealed trait scale180Percent extends ResolutionScale
  
  /* 0 */ val invalid: typings.winrt.Windows.Graphics.Display.ResolutionScale.invalid with Double = js.native
  /* 1 */ val scale100Percent: typings.winrt.Windows.Graphics.Display.ResolutionScale.scale100Percent with Double = js.native
  /* 2 */ val scale140Percent: typings.winrt.Windows.Graphics.Display.ResolutionScale.scale140Percent with Double = js.native
  /* 3 */ val scale180Percent: typings.winrt.Windows.Graphics.Display.ResolutionScale.scale180Percent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResolutionScale with Double] = js.native
}

