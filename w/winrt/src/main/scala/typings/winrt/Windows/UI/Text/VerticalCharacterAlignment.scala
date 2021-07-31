package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalCharacterAlignment extends StObject
@JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
@js.native
object VerticalCharacterAlignment extends StObject {
  
  @js.native
  sealed trait baseline
    extends StObject
       with VerticalCharacterAlignment
  
  @js.native
  sealed trait bottom
    extends StObject
       with VerticalCharacterAlignment
  
  @js.native
  sealed trait top
    extends StObject
       with VerticalCharacterAlignment
}
