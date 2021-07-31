package typings.winrtUwp.global.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reports the completion of the print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletedEventArgs")
@js.native
abstract class PrintTaskCompletedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletedEventArgs {
  
  /** Gets the completion status of the print task. */
  /* CompleteClass */
  var completion: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion = js.native
}
