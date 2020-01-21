package typings.winrtUwp.Windows.Graphics.Display

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResolutionScale with Double] = js.native
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 1 */ @js.native
  object scale100Percent extends TopLevel[scale100Percent with Double]
  
  /* 2 */ @js.native
  object scale120Percent extends TopLevel[scale120Percent with Double]
  
  /* 3 */ @js.native
  object scale125Percent extends TopLevel[scale125Percent with Double]
  
  /* 4 */ @js.native
  object scale140Percent extends TopLevel[scale140Percent with Double]
  
  /* 5 */ @js.native
  object scale150Percent extends TopLevel[scale150Percent with Double]
  
  /* 6 */ @js.native
  object scale160Percent extends TopLevel[scale160Percent with Double]
  
  /* 7 */ @js.native
  object scale175Percent extends TopLevel[scale175Percent with Double]
  
  /* 8 */ @js.native
  object scale180Percent extends TopLevel[scale180Percent with Double]
  
  /* 9 */ @js.native
  object scale200Percent extends TopLevel[scale200Percent with Double]
  
  /* 10 */ @js.native
  object scale225Percent extends TopLevel[scale225Percent with Double]
  
  /* 11 */ @js.native
  object scale250Percent extends TopLevel[scale250Percent with Double]
  
  /* 12 */ @js.native
  object scale300Percent extends TopLevel[scale300Percent with Double]
  
  /* 13 */ @js.native
  object scale350Percent extends TopLevel[scale350Percent with Double]
  
  /* 14 */ @js.native
  object scale400Percent extends TopLevel[scale400Percent with Double]
  
  /* 15 */ @js.native
  object scale450Percent extends TopLevel[scale450Percent with Double]
  
  /* 16 */ @js.native
  object scale500Percent extends TopLevel[scale500Percent with Double]
  
}

