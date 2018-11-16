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
  
  val invalid: invalid with java.lang.String = js.native
  val scale100Percent: scale100Percent with java.lang.String = js.native
  val scale120Percent: scale120Percent with java.lang.String = js.native
  val scale125Percent: scale125Percent with java.lang.String = js.native
  val scale140Percent: scale140Percent with java.lang.String = js.native
  val scale150Percent: scale150Percent with java.lang.String = js.native
  val scale160Percent: scale160Percent with java.lang.String = js.native
  val scale175Percent: scale175Percent with java.lang.String = js.native
  val scale180Percent: scale180Percent with java.lang.String = js.native
  val scale200Percent: scale200Percent with java.lang.String = js.native
  val scale225Percent: scale225Percent with java.lang.String = js.native
  val scale250Percent: scale250Percent with java.lang.String = js.native
  val scale300Percent: scale300Percent with java.lang.String = js.native
  val scale350Percent: scale350Percent with java.lang.String = js.native
  val scale400Percent: scale400Percent with java.lang.String = js.native
  val scale450Percent: scale450Percent with java.lang.String = js.native
  val scale500Percent: scale500Percent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale with java.lang.String
  ] = js.native
}

