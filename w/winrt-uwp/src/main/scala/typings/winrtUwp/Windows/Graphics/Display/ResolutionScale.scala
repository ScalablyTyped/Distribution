package typings.winrtUwp.Windows.Graphics.Display

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
  
}

