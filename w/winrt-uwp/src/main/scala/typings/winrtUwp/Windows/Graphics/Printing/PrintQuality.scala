package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintQuality extends StObject
/** Specifies the print quality options for the printed output. */
@JSGlobal("Windows.Graphics.Printing.PrintQuality")
@js.native
object PrintQuality extends StObject {
  
  /** The default print quality option. */
  @js.native
  sealed trait default
    extends StObject
       with PrintQuality
  
  /** The option to automatically select the print quality. */
  @js.native
  sealed trait automatic
    extends StObject
       with PrintQuality
  
  /** The Draft print quality option. */
  @js.native
  sealed trait draft
    extends StObject
       with PrintQuality
  
  /** The Fax print quality option. */
  @js.native
  sealed trait fax
    extends StObject
       with PrintQuality
  
  /** The High print quality option. */
  @js.native
  sealed trait high
    extends StObject
       with PrintQuality
  
  /** The Normal print quality option. */
  @js.native
  sealed trait normal
    extends StObject
       with PrintQuality
  
  /** A print quality option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintQuality
  
  /** The Photographic print quality option. */
  @js.native
  sealed trait photographic
    extends StObject
       with PrintQuality
  
  /** A print quality option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintQuality
  
  /** The Text print quality option. */
  @js.native
  sealed trait text
    extends StObject
       with PrintQuality
}
