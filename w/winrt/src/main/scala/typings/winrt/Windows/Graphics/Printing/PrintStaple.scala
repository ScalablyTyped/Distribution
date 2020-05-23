package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintStaple extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintStaple")
@js.native
object PrintStaple extends js.Object {
  @js.native
  sealed trait default extends PrintStaple
  
  @js.native
  sealed trait none extends PrintStaple
  
  @js.native
  sealed trait notAvailable extends PrintStaple
  
  @js.native
  sealed trait printerCustom extends PrintStaple
  
  @js.native
  sealed trait saddleStitch extends PrintStaple
  
  @js.native
  sealed trait stapleBottomLeft extends PrintStaple
  
  @js.native
  sealed trait stapleBottomRight extends PrintStaple
  
  @js.native
  sealed trait stapleDualBottom extends PrintStaple
  
  @js.native
  sealed trait stapleDualLeft extends PrintStaple
  
  @js.native
  sealed trait stapleDualRight extends PrintStaple
  
  @js.native
  sealed trait stapleDualTop extends PrintStaple
  
  @js.native
  sealed trait stapleTopLeft extends PrintStaple
  
  @js.native
  sealed trait stapleTopRight extends PrintStaple
  
}

