package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerAlignment extends StObject
/** Defines bullet and numbering alignment. */
@JSGlobal("Windows.UI.Text.MarkerAlignment")
@js.native
object MarkerAlignment extends StObject {
  
  /** Text is centered in the line. */
  @js.native
  sealed trait center
    extends StObject
       with MarkerAlignment
  
  /** Text is left aligned. */
  @js.native
  sealed trait left
    extends StObject
       with MarkerAlignment
  
  /** Text is right aligned. */
  @js.native
  sealed trait right
    extends StObject
       with MarkerAlignment
  
  /** The value is undefined. */
  @js.native
  sealed trait undefined
    extends StObject
       with MarkerAlignment
}
