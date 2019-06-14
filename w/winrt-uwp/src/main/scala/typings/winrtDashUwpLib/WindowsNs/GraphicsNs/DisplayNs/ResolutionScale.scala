package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResolutionScale extends js.Object

/** Describes the scale factor of the immersive environment. The scale factor is determined by the operating system in response to high pixel density screens. */
@JSGlobal("Windows.Graphics.Display.ResolutionScale")
@js.native
object ResolutionScale extends js.Object {
  /** Specifies the scale of a display is invalid. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 100 percent. */
  @js.native
  sealed trait scale100Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** This value isn't used. */
  @js.native
  sealed trait scale120Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 125 percent. */
  @js.native
  sealed trait scale125Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 140 percent. */
  @js.native
  sealed trait scale140Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Applies to Windows Phone 8. */
  @js.native
  sealed trait scale150Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Applies to Windows Phone 8. */
  @js.native
  sealed trait scale160Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 175 percent. */
  @js.native
  sealed trait scale175Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 180 percent. */
  @js.native
  sealed trait scale180Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 200 percent. */
  @js.native
  sealed trait scale200Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** This value isn't used. */
  @js.native
  sealed trait scale225Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 250 percent. */
  @js.native
  sealed trait scale250Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 300 percent. */
  @js.native
  sealed trait scale300Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 350 percent. */
  @js.native
  sealed trait scale350Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 400 percent. */
  @js.native
  sealed trait scale400Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 450 percent. */
  @js.native
  sealed trait scale450Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /** Specifies the scale of a display as 500 percent. */
  @js.native
  sealed trait scale500Percent
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale
  
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 1 */ val scale100Percent: scale100Percent with scala.Double = js.native
  /* 2 */ val scale120Percent: scale120Percent with scala.Double = js.native
  /* 3 */ val scale125Percent: scale125Percent with scala.Double = js.native
  /* 4 */ val scale140Percent: scale140Percent with scala.Double = js.native
  /* 5 */ val scale150Percent: scale150Percent with scala.Double = js.native
  /* 6 */ val scale160Percent: scale160Percent with scala.Double = js.native
  /* 7 */ val scale175Percent: scale175Percent with scala.Double = js.native
  /* 8 */ val scale180Percent: scale180Percent with scala.Double = js.native
  /* 9 */ val scale200Percent: scale200Percent with scala.Double = js.native
  /* 10 */ val scale225Percent: scale225Percent with scala.Double = js.native
  /* 11 */ val scale250Percent: scale250Percent with scala.Double = js.native
  /* 12 */ val scale300Percent: scale300Percent with scala.Double = js.native
  /* 13 */ val scale350Percent: scale350Percent with scala.Double = js.native
  /* 14 */ val scale400Percent: scale400Percent with scala.Double = js.native
  /* 15 */ val scale450Percent: scale450Percent with scala.Double = js.native
  /* 16 */ val scale500Percent: scale500Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale with scala.Double] = js.native
}

