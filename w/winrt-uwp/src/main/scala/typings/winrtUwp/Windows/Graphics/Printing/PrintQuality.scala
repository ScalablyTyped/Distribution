package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintQuality with Double] = js.native
  /* 3 */ @js.native
  object automatic extends TopLevel[automatic with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 4 */ @js.native
  object draft extends TopLevel[draft with Double]
  
  /* 5 */ @js.native
  object fax extends TopLevel[fax with Double]
  
  /* 6 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 7 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 8 */ @js.native
  object photographic extends TopLevel[photographic with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 9 */ @js.native
  object text extends TopLevel[text with Double]
  
}

