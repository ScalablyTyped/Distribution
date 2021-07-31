package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabAlignment extends StObject
@JSGlobal("Windows.UI.Text.TabAlignment")
@js.native
object TabAlignment extends StObject {
  
  @js.native
  sealed trait bar
    extends StObject
       with TabAlignment
  
  @js.native
  sealed trait center
    extends StObject
       with TabAlignment
  
  @js.native
  sealed trait decimal
    extends StObject
       with TabAlignment
  
  @js.native
  sealed trait left
    extends StObject
       with TabAlignment
  
  @js.native
  sealed trait right
    extends StObject
       with TabAlignment
}
