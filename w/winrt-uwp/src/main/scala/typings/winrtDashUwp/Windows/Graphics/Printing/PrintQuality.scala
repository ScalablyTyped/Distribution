package typings.winrtDashUwp.Windows.Graphics.Printing

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
  sealed trait automatic extends PrintQuality
  
  /** The default print quality option. */
  @js.native
  sealed trait default extends PrintQuality
  
  /** The Draft print quality option. */
  @js.native
  sealed trait draft extends PrintQuality
  
  /** The Fax print quality option. */
  @js.native
  sealed trait fax extends PrintQuality
  
  /** The High print quality option. */
  @js.native
  sealed trait high extends PrintQuality
  
  /** The Normal print quality option. */
  @js.native
  sealed trait normal extends PrintQuality
  
  /** A print quality option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable extends PrintQuality
  
  /** The Photographic print quality option. */
  @js.native
  sealed trait photographic extends PrintQuality
  
  /** A print quality option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintQuality
  
  /** The Text print quality option. */
  @js.native
  sealed trait text extends PrintQuality
  
  /* 3 */ val automatic: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.automatic with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.default with Double = js.native
  /* 4 */ val draft: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.draft with Double = js.native
  /* 5 */ val fax: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.fax with Double = js.native
  /* 6 */ val high: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.high with Double = js.native
  /* 7 */ val normal: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.normal with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.notAvailable with Double = js.native
  /* 8 */ val photographic: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.photographic with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.printerCustom with Double = js.native
  /* 9 */ val text: typings.winrtDashUwp.Windows.Graphics.Printing.PrintQuality.text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintQuality with Double] = js.native
}

