package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintHolePunch extends StObject
/** Specifies the hole punch option. */
@JSGlobal("Windows.Graphics.Printing.PrintHolePunch")
@js.native
object PrintHolePunch extends StObject {
  
  /** The default hole punch option. */
  @js.native
  sealed trait default
    extends StObject
       with PrintHolePunch
  
  /** The option to indicate that hole punching required along the bottom edges of the sheets. */
  @js.native
  sealed trait bottomEdge
    extends StObject
       with PrintHolePunch
  
  /** The option to indicate that hole punching required along the left edges of the sheets. */
  @js.native
  sealed trait leftEdge
    extends StObject
       with PrintHolePunch
  
  /** The option to indicate that hole punching is not required. */
  @js.native
  sealed trait none
    extends StObject
       with PrintHolePunch
  
  /** An unsupported hole punch option. */
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintHolePunch
  
  /** A custom hole punch option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintHolePunch
  
  /** The option to indicate that hole punching required along the right edges of the sheets. */
  @js.native
  sealed trait rightEdge
    extends StObject
       with PrintHolePunch
  
  /** The option to indicate that hole punching required along the top edges of the sheets. */
  @js.native
  sealed trait topEdge
    extends StObject
       with PrintHolePunch
}
