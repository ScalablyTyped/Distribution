package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOptionStates extends StObject
/** Specifies the print task option states. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
@js.native
object PrintOptionStates extends StObject {
  
  /** The UI for the print tasks is visible to the user. */
  @js.native
  sealed trait constrained
    extends StObject
       with PrintOptionStates
  
  /** The UI for the print tasks has been enabled. */
  @js.native
  sealed trait enabled
    extends StObject
       with PrintOptionStates
  
  /** The UI for the print tasks has not been enabled. */
  @js.native
  sealed trait none
    extends StObject
       with PrintOptionStates
}
