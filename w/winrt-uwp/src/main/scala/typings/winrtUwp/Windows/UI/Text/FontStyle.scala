package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontStyle extends StObject
/** Represents the style of a font face (for example, normal or italic). */
@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends StObject {
  
  /** Represents an italic font style. */
  @js.native
  sealed trait italic
    extends StObject
       with FontStyle
  
  /** Represents a normal font style. */
  @js.native
  sealed trait normal
    extends StObject
       with FontStyle
  
  /** Represents an oblique font style. */
  @js.native
  sealed trait oblique
    extends StObject
       with FontStyle
}
