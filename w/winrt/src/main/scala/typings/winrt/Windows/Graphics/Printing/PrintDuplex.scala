package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintDuplex extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintDuplex")
@js.native
object PrintDuplex extends StObject {
  
  @js.native
  sealed trait default extends PrintDuplex
  
  @js.native
  sealed trait notAvailable extends PrintDuplex
  
  @js.native
  sealed trait oneSided extends PrintDuplex
  
  @js.native
  sealed trait printerCustom extends PrintDuplex
  
  @js.native
  sealed trait twoSidedLongEdge extends PrintDuplex
  
  @js.native
  sealed trait twoSidedShortEdge extends PrintDuplex
}
