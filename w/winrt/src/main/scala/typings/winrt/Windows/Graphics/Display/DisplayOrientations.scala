package typings.winrt.Windows.Graphics.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayOrientations extends js.Object

@JSGlobal("Windows.Graphics.Display.DisplayOrientations")
@js.native
object DisplayOrientations extends js.Object {
  @js.native
  sealed trait landscape extends DisplayOrientations
  
  @js.native
  sealed trait landscapeFlipped extends DisplayOrientations
  
  @js.native
  sealed trait none extends DisplayOrientations
  
  @js.native
  sealed trait portrait extends DisplayOrientations
  
  @js.native
  sealed trait portraitFlipped extends DisplayOrientations
  
  /* 1 */ val landscape: typings.winrt.Windows.Graphics.Display.DisplayOrientations.landscape with Double = js.native
  /* 3 */ val landscapeFlipped: typings.winrt.Windows.Graphics.Display.DisplayOrientations.landscapeFlipped with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Graphics.Display.DisplayOrientations.none with Double = js.native
  /* 2 */ val portrait: typings.winrt.Windows.Graphics.Display.DisplayOrientations.portrait with Double = js.native
  /* 4 */ val portraitFlipped: typings.winrt.Windows.Graphics.Display.DisplayOrientations.portraitFlipped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DisplayOrientations with Double] = js.native
}

