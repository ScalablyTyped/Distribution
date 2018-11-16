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
  
  val invalid: invalid with java.lang.String = js.native
  val scale100Percent: scale100Percent with java.lang.String = js.native
  val scale140Percent: scale140Percent with java.lang.String = js.native
  val scale180Percent: scale180Percent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale with java.lang.String] = js.native
}

