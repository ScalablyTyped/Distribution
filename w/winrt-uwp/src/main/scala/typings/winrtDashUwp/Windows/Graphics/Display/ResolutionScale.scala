package typings.winrtDashUwp.Windows.Graphics.Display

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
  sealed trait invalid extends ResolutionScale
  
  /** Specifies the scale of a display as 100 percent. */
  @js.native
  sealed trait scale100Percent extends ResolutionScale
  
  /** This value isn't used. */
  @js.native
  sealed trait scale120Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 125 percent. */
  @js.native
  sealed trait scale125Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 140 percent. */
  @js.native
  sealed trait scale140Percent extends ResolutionScale
  
  /** Applies to Windows Phone 8. */
  @js.native
  sealed trait scale150Percent extends ResolutionScale
  
  /** Applies to Windows Phone 8. */
  @js.native
  sealed trait scale160Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 175 percent. */
  @js.native
  sealed trait scale175Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 180 percent. */
  @js.native
  sealed trait scale180Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 200 percent. */
  @js.native
  sealed trait scale200Percent extends ResolutionScale
  
  /** This value isn't used. */
  @js.native
  sealed trait scale225Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 250 percent. */
  @js.native
  sealed trait scale250Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 300 percent. */
  @js.native
  sealed trait scale300Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 350 percent. */
  @js.native
  sealed trait scale350Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 400 percent. */
  @js.native
  sealed trait scale400Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 450 percent. */
  @js.native
  sealed trait scale450Percent extends ResolutionScale
  
  /** Specifies the scale of a display as 500 percent. */
  @js.native
  sealed trait scale500Percent extends ResolutionScale
  
  /* 0 */ val invalid: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.invalid with Double = js.native
  /* 1 */ val scale100Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale100Percent with Double = js.native
  /* 2 */ val scale120Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale120Percent with Double = js.native
  /* 3 */ val scale125Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale125Percent with Double = js.native
  /* 4 */ val scale140Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale140Percent with Double = js.native
  /* 5 */ val scale150Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale150Percent with Double = js.native
  /* 6 */ val scale160Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale160Percent with Double = js.native
  /* 7 */ val scale175Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale175Percent with Double = js.native
  /* 8 */ val scale180Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale180Percent with Double = js.native
  /* 9 */ val scale200Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale200Percent with Double = js.native
  /* 10 */ val scale225Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale225Percent with Double = js.native
  /* 11 */ val scale250Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale250Percent with Double = js.native
  /* 12 */ val scale300Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale300Percent with Double = js.native
  /* 13 */ val scale350Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale350Percent with Double = js.native
  /* 14 */ val scale400Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale400Percent with Double = js.native
  /* 15 */ val scale450Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale450Percent with Double = js.native
  /* 16 */ val scale500Percent: typings.winrtDashUwp.Windows.Graphics.Display.ResolutionScale.scale500Percent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResolutionScale with Double] = js.native
}

