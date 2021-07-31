package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrientation extends StObject
/** Specifies the orientation options for the printed output. */
@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends StObject {
  
  /** The default orientation option. */
  @js.native
  sealed trait default
    extends StObject
       with PrintOrientation
  
  /** The Landscape orientation option. */
  @js.native
  sealed trait landscape
    extends StObject
       with PrintOrientation
  
  /** The LandscapeFlipped orientation option. */
  @js.native
  sealed trait landscapeFlipped
    extends StObject
       with PrintOrientation
  
  /** An orientaiton option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintOrientation
  
  /** The Portrait orientation option. */
  @js.native
  sealed trait portrait
    extends StObject
       with PrintOrientation
  
  /** The PortraitFlipped orientation option. */
  @js.native
  sealed trait portraitFlipped
    extends StObject
       with PrintOrientation
  
  /** A custom orientation that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintOrientation
}
