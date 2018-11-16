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
  
  val landscape: landscape with java.lang.String = js.native
  val landscapeFlipped: landscapeFlipped with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val portrait: portrait with java.lang.String = js.native
  val portraitFlipped: portraitFlipped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations with java.lang.String
  ] = js.native
}

