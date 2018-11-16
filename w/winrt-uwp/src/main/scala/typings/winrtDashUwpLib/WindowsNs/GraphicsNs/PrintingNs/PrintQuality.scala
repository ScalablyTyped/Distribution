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
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintQuality with java.lang.String
  ] = js.native
}

