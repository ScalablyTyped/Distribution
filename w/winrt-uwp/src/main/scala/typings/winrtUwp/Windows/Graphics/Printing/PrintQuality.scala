package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
