package typings.winrtUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClosedCaptionStyle extends StObject
/** Specifies the style of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionStyle")
@js.native
object ClosedCaptionStyle extends StObject {
  
  /** The default style. */
  @js.native
  sealed trait default
    extends StObject
       with ClosedCaptionStyle
  
  /** Casual. */
  @js.native
  sealed trait casual
    extends StObject
       with ClosedCaptionStyle
  
  /** Cursive. */
  @js.native
  sealed trait cursive
    extends StObject
       with ClosedCaptionStyle
  
  /** Monospaced with serifs. */
  @js.native
  sealed trait monospacedWithSerifs
    extends StObject
       with ClosedCaptionStyle
  
  /** Monospaced without serifs */
  @js.native
  sealed trait monospacedWithoutSerifs
    extends StObject
       with ClosedCaptionStyle
  
  /** Proportional with serifs. */
  @js.native
  sealed trait proportionalWithSerifs
    extends StObject
       with ClosedCaptionStyle
  
  /** Proportional without serifs. */
  @js.native
  sealed trait proportionalWithoutSerifs
    extends StObject
       with ClosedCaptionStyle
  
  /** Small capitals. */
  @js.native
  sealed trait smallCapitals
    extends StObject
       with ClosedCaptionStyle
}
