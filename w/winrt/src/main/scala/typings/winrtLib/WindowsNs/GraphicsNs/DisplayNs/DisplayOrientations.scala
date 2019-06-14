package typings
package winrtLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayOrientations extends js.Object

@JSGlobal("Windows.Graphics.Display.DisplayOrientations")
@js.native
object DisplayOrientations extends js.Object {
  @js.native
  sealed trait landscape
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  @js.native
  sealed trait landscapeFlipped
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  @js.native
  sealed trait portrait
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  @js.native
  sealed trait portraitFlipped
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  /* 1 */ val landscape: landscape with scala.Double = js.native
  /* 3 */ val landscapeFlipped: landscapeFlipped with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val portrait: portrait with scala.Double = js.native
  /* 4 */ val portraitFlipped: portraitFlipped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations with scala.Double] = js.native
}

