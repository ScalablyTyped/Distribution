package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintQuality extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintQuality")
@js.native
object PrintQuality extends js.Object {
  @js.native
  sealed trait automatic
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait draft
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait fax
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait high
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait photographic
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  @js.native
  sealed trait text
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /* 3 */ val automatic: automatic with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 4 */ val draft: draft with scala.Double = js.native
  /* 5 */ val fax: fax with scala.Double = js.native
  /* 6 */ val high: high with scala.Double = js.native
  /* 7 */ val normal: normal with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 8 */ val photographic: photographic with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 9 */ val text: text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality with scala.Double] = js.native
}

