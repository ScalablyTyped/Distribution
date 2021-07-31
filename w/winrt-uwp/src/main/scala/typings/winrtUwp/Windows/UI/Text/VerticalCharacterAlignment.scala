package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalCharacterAlignment extends StObject
/** Specifies the vertical position of a character relative to a bounding rectangle. */
@JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
@js.native
object VerticalCharacterAlignment extends StObject {
  
  /** The character is positioned at the text baseline. */
  @js.native
  sealed trait baseline
    extends StObject
       with VerticalCharacterAlignment
  
  /** The character is positioned at the bottom edge of the bounding rectangle. */
  @js.native
  sealed trait bottom
    extends StObject
       with VerticalCharacterAlignment
  
  /** The character is positioned at the top edge of the bounding rectangle. */
  @js.native
  sealed trait top
    extends StObject
       with VerticalCharacterAlignment
}
