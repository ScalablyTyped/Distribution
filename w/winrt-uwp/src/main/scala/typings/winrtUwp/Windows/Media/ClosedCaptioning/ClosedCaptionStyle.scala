package typings.winrtUwp.Windows.Media.ClosedCaptioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
