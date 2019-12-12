package typings.winrt.Windows.Graphics.Display

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Display.ResolutionScale.invalid
import typings.winrt.Windows.Graphics.Display.ResolutionScale.scale100Percent
import typings.winrt.Windows.Graphics.Display.ResolutionScale.scale140Percent
import typings.winrt.Windows.Graphics.Display.ResolutionScale.scale180Percent
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResolutionScale with Double] = js.native
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 1 */ @js.native
  object scale100Percent extends TopLevel[scale100Percent with Double]
  
  /* 2 */ @js.native
  object scale140Percent extends TopLevel[scale140Percent with Double]
  
  /* 3 */ @js.native
  object scale180Percent extends TopLevel[scale180Percent with Double]
  
}

