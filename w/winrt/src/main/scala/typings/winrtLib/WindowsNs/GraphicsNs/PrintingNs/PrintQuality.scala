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
  
  val automatic: automatic with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val draft: draft with java.lang.String = js.native
  val fax: fax with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val photographic: photographic with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality with java.lang.String] = js.native
}

