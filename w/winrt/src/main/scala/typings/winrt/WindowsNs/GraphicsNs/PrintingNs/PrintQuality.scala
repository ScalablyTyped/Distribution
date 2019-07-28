package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

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
  
  /* 3 */ val automatic: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.automatic with Double = js.native
  /* 0 */ val default: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.default with Double = js.native
  /* 4 */ val draft: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.draft with Double = js.native
  /* 5 */ val fax: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.fax with Double = js.native
  /* 6 */ val high: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.high with Double = js.native
  /* 7 */ val normal: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.normal with Double = js.native
  /* 1 */ val notAvailable: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.notAvailable with Double = js.native
  /* 8 */ val photographic: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.photographic with Double = js.native
  /* 2 */ val printerCustom: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.printerCustom with Double = js.native
  /* 9 */ val text: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintQuality.text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintQuality with Double] = js.native
}

