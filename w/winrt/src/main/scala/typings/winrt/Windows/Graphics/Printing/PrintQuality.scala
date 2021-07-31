package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintQuality extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintQuality")
@js.native
object PrintQuality extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait automatic
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait draft
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait fax
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait high
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait normal
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait photographic
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintQuality
  
  @js.native
  sealed trait text
    extends StObject
       with PrintQuality
}
