package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalCharacterAlignment extends StObject
/** Specifies the horizontal position of a character relative to a bounding rectangle. */
@JSGlobal("Windows.UI.Text.HorizontalCharacterAlignment")
@js.native
object HorizontalCharacterAlignment extends StObject {
  
  /** The character is at the center of the bounding rectangle. */
  @js.native
  sealed trait center
    extends StObject
       with HorizontalCharacterAlignment
  
  /** The character is at the left edge of the bounding rectangle. */
  @js.native
  sealed trait left
    extends StObject
       with HorizontalCharacterAlignment
  
  /** The character is at the right edge of the bounding rectangle. */
  @js.native
  sealed trait right
    extends StObject
       with HorizontalCharacterAlignment
}
