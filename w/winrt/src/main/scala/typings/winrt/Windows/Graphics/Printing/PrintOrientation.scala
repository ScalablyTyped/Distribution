package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrientation extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with PrintOrientation
  
  @js.native
  sealed trait landscape
    extends StObject
       with PrintOrientation
  
  @js.native
  sealed trait landscapeFlipped
    extends StObject
       with PrintOrientation
  
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintOrientation
  
  @js.native
  sealed trait portrait
    extends StObject
       with PrintOrientation
  
  @js.native
  sealed trait portraitFlipped
    extends StObject
       with PrintOrientation
  
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintOrientation
}
