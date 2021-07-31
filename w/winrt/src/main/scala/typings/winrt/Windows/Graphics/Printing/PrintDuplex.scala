package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintDuplex extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintDuplex")
@js.native
object PrintDuplex extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with PrintDuplex
  
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintDuplex
  
  @js.native
  sealed trait oneSided
    extends StObject
       with PrintDuplex
  
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintDuplex
  
  @js.native
  sealed trait twoSidedLongEdge
    extends StObject
       with PrintDuplex
  
  @js.native
  sealed trait twoSidedShortEdge
    extends StObject
       with PrintDuplex
}
