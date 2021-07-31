package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabAlignment extends StObject
/** Alignment options for tab positions. */
@JSGlobal("Windows.UI.Text.TabAlignment")
@js.native
object TabAlignment extends StObject {
  
  /** A vertical bar is positioned at the tab position. Text is not affected. Alignment bars on nearby lines at the same position form a continuous vertical line. */
  @js.native
  sealed trait bar
    extends StObject
       with TabAlignment
  
  /** Text is centered on the tab position. */
  @js.native
  sealed trait center
    extends StObject
       with TabAlignment
  
  /** The decimal point is set at the tab position. This is useful for aligning a column of decimal numbers. */
  @js.native
  sealed trait decimal
    extends StObject
       with TabAlignment
  
  /** Text is left justified from the tab position. This is the default. */
  @js.native
  sealed trait left
    extends StObject
       with TabAlignment
  
  /** Text is right justified from the tab position. */
  @js.native
  sealed trait right
    extends StObject
       with TabAlignment
}
