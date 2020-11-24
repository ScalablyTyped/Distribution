package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintHolePunch extends js.Object
@JSGlobal("Windows.Graphics.Printing.PrintHolePunch")
@js.native
object PrintHolePunch extends js.Object {
  
  @js.native
  sealed trait bottomEdge extends PrintHolePunch
  
  @js.native
  sealed trait default extends PrintHolePunch
  
  @js.native
  sealed trait leftEdge extends PrintHolePunch
  
  @js.native
  sealed trait none extends PrintHolePunch
  
  @js.native
  sealed trait notAvailable extends PrintHolePunch
  
  @js.native
  sealed trait printerCustom extends PrintHolePunch
  
  @js.native
  sealed trait rightEdge extends PrintHolePunch
  
  @js.native
  sealed trait topEdge extends PrintHolePunch
}
