package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintColorMode extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintColorMode")
@js.native
object PrintColorMode extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with PrintColorMode
  
  @js.native
  sealed trait color
    extends StObject
       with PrintColorMode
  
  @js.native
  sealed trait grayscale
    extends StObject
       with PrintColorMode
  
  @js.native
  sealed trait monochrome
    extends StObject
       with PrintColorMode
  
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintColorMode
  
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintColorMode
}
