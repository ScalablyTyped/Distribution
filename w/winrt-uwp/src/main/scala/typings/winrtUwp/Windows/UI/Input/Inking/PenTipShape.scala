package typings.winrtUwp.Windows.UI.Input.Inking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PenTipShape extends StObject
/** Identifies the shape of the PenTip . */
@JSGlobal("Windows.UI.Input.Inking.PenTipShape")
@js.native
object PenTipShape extends StObject {
  
  /** Circular or elliptical pen tip. Use Size to specify the dimensions. */
  @js.native
  sealed trait circle
    extends StObject
       with PenTipShape
  
  /** Square or rectangular pen tip. Use Size to specify the dimensions. */
  @js.native
  sealed trait rectangle
    extends StObject
       with PenTipShape
}
