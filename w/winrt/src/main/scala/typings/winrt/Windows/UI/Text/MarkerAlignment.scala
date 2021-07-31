package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerAlignment extends StObject
@JSGlobal("Windows.UI.Text.MarkerAlignment")
@js.native
object MarkerAlignment extends StObject {
  
  @js.native
  sealed trait center
    extends StObject
       with MarkerAlignment
  
  @js.native
  sealed trait left
    extends StObject
       with MarkerAlignment
  
  @js.native
  sealed trait right
    extends StObject
       with MarkerAlignment
  
  @js.native
  sealed trait undefined
    extends StObject
       with MarkerAlignment
}
