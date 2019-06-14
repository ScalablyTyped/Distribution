package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintQuality extends js.Object

/** Specifies the print quality options for the printed output. */
@JSGlobal("Windows.Graphics.Printing.PrintQuality")
@js.native
object PrintQuality extends js.Object {
  /** The option to automatically select the print quality. */
  @js.native
  sealed trait automatic
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** The default print quality option. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** The Draft print quality option. */
  @js.native
  sealed trait draft
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** The Fax print quality option. */
  @js.native
  sealed trait fax
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** The High print quality option. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** The Normal print quality option. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** A print quality option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** The Photographic print quality option. */
  @js.native
  sealed trait photographic
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** A print quality option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
  /** The Text print quality option. */
  @js.native
  sealed trait text
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality
  
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
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality with scala.Double] = js.native
}

