package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

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
  
  /* 5 */ val casual: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.casual with Double = js.native
  /* 6 */ val cursive: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.cursive with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.default with Double = js.native
  /* 1 */ val monospacedWithSerifs: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.monospacedWithSerifs with Double = js.native
  /* 3 */ val monospacedWithoutSerifs: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.monospacedWithoutSerifs with Double = js.native
  /* 2 */ val proportionalWithSerifs: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.proportionalWithSerifs with Double = js.native
  /* 4 */ val proportionalWithoutSerifs: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.proportionalWithoutSerifs with Double = js.native
  /* 7 */ val smallCapitals: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.smallCapitals with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionStyle with Double] = js.native
}

