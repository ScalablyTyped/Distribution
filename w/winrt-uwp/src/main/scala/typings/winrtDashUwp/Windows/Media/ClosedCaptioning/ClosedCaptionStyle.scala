package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionStyle extends js.Object

/** Specifies the style of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionStyle")
@js.native
object ClosedCaptionStyle extends js.Object {
  /** Casual. */
  @js.native
  sealed trait casual extends ClosedCaptionStyle
  
  /** Cursive. */
  @js.native
  sealed trait cursive extends ClosedCaptionStyle
  
  /** The default style. */
  @js.native
  sealed trait default extends ClosedCaptionStyle
  
  /** Monospaced with serifs. */
  @js.native
  sealed trait monospacedWithSerifs extends ClosedCaptionStyle
  
  /** Monospaced without serifs */
  @js.native
  sealed trait monospacedWithoutSerifs extends ClosedCaptionStyle
  
  /** Proportional with serifs. */
  @js.native
  sealed trait proportionalWithSerifs extends ClosedCaptionStyle
  
  /** Proportional without serifs. */
  @js.native
  sealed trait proportionalWithoutSerifs extends ClosedCaptionStyle
  
  /** Small capitals. */
  @js.native
  sealed trait smallCapitals extends ClosedCaptionStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionStyle with Double] = js.native
  /* 5 */ @js.native
  object casual extends TopLevel[casual with Double]
  
  /* 6 */ @js.native
  object cursive extends TopLevel[cursive with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object monospacedWithSerifs extends TopLevel[monospacedWithSerifs with Double]
  
  /* 3 */ @js.native
  object monospacedWithoutSerifs extends TopLevel[monospacedWithoutSerifs with Double]
  
  /* 2 */ @js.native
  object proportionalWithSerifs extends TopLevel[proportionalWithSerifs with Double]
  
  /* 4 */ @js.native
  object proportionalWithoutSerifs extends TopLevel[proportionalWithoutSerifs with Double]
  
  /* 7 */ @js.native
  object smallCapitals extends TopLevel[smallCapitals with Double]
  
}

