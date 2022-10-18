package typings.winrtUwp.global.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the event arguments for the PrintTask.Progressing event. This event is raised during the submitting phase of the PrintTask . */
/* note: abstract class */ @JSGlobal("Windows.Graphics.Printing.PrintTaskProgressingEventArgs")
@js.native
open class PrintTaskProgressingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Graphics.Printing.PrintTaskProgressingEventArgs {
  
  /** Gets the page count for a print task. */
  /* CompleteClass */
  var documentPageCount: Double = js.native
}
