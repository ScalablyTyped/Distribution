package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintQuality extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintQuality")
@js.native
object PrintQuality extends js.Object {
  @js.native
  sealed trait automatic extends PrintQuality
  
  @js.native
  sealed trait default extends PrintQuality
  
  @js.native
  sealed trait draft extends PrintQuality
  
  @js.native
  sealed trait fax extends PrintQuality
  
  @js.native
  sealed trait high extends PrintQuality
  
  @js.native
  sealed trait normal extends PrintQuality
  
  @js.native
  sealed trait notAvailable extends PrintQuality
  
  @js.native
  sealed trait photographic extends PrintQuality
  
  @js.native
  sealed trait printerCustom extends PrintQuality
  
  @js.native
  sealed trait text extends PrintQuality
  
}

