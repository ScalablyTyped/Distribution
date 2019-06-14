package typings
package winrtLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResolutionScale extends js.Object

@JSGlobal("Windows.Graphics.Display.ResolutionScale")
@js.native
object ResolutionScale extends js.Object {
  @js.native
  sealed trait invalid
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  @js.native
  sealed trait scale100Percent
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  @js.native
  sealed trait scale140Percent
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  @js.native
  sealed trait scale180Percent
    extends winrtLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 1 */ val scale100Percent: scale100Percent with scala.Double = js.native
  /* 2 */ val scale140Percent: scale140Percent with scala.Double = js.native
  /* 3 */ val scale180Percent: scale180Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale with scala.Double] = js.native
}

