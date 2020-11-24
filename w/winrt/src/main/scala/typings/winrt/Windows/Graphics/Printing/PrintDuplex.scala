package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintDuplex extends js.Object
@JSGlobal("Windows.Graphics.Printing.PrintDuplex")
@js.native
object PrintDuplex extends js.Object {
  
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
