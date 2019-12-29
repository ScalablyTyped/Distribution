package typings.winrtDashUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIColorType extends js.Object

/** Defines constants that specify known system color values. */
@JSGlobal("Windows.UI.ViewManagement.UIColorType")
@js.native
object UIColorType extends js.Object {
  /** The accent color. */
  @js.native
  sealed trait accent extends UIColorType
  
  /** The dark accent color. */
  @js.native
  sealed trait accentDark1 extends UIColorType
  
  /** The darker accent color. */
  @js.native
  sealed trait accentDark2 extends UIColorType
  
  /** The darkest accent color. */
  @js.native
  sealed trait accentDark3 extends UIColorType
  
  /** The light accent color. */
  @js.native
  sealed trait accentLight1 extends UIColorType
  
  /** The lighter accent color. */
  @js.native
  sealed trait accentLight2 extends UIColorType
  
  /** The lightest accent color. */
  @js.native
  sealed trait accentLight3 extends UIColorType
  
  /** The background color. */
  @js.native
  sealed trait background extends UIColorType
  
  /** The complement color. */
  @js.native
  sealed trait complement extends UIColorType
  
  /** The foreground color. */
  @js.native
  sealed trait foreground extends UIColorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIColorType with Double] = js.native
  /* 5 */ @js.native
  object accent extends TopLevel[accent with Double]
  
  /* 4 */ @js.native
  object accentDark1 extends TopLevel[accentDark1 with Double]
  
  /* 3 */ @js.native
  object accentDark2 extends TopLevel[accentDark2 with Double]
  
  /* 2 */ @js.native
  object accentDark3 extends TopLevel[accentDark3 with Double]
  
  /* 6 */ @js.native
  object accentLight1 extends TopLevel[accentLight1 with Double]
  
  /* 7 */ @js.native
  object accentLight2 extends TopLevel[accentLight2 with Double]
  
  /* 8 */ @js.native
  object accentLight3 extends TopLevel[accentLight3 with Double]
  
  /* 0 */ @js.native
  object background extends TopLevel[background with Double]
  
  /* 9 */ @js.native
  object complement extends TopLevel[complement with Double]
  
  /* 1 */ @js.native
  object foreground extends TopLevel[foreground with Double]
  
}

