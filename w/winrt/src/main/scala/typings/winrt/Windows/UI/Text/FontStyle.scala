package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontStyle extends StObject
@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends StObject {
  
  @js.native
  sealed trait italic
    extends StObject
       with FontStyle
  
  @js.native
  sealed trait normal
    extends StObject
       with FontStyle
  
  @js.native
  sealed trait oblique
    extends StObject
       with FontStyle
}
