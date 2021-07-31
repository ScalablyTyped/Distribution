package typings.winrtUwp.global.Windows.Graphics.Printing

import typings.std.Date
import typings.winrtUwp.Windows.Graphics.Printing.IPrintDocumentSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments associated with the PrintTaskSourceRequestedHandler delegate. Provides a method for handing the content to be printed to the Print Task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
abstract class PrintTaskSourceRequestedArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Graphics.Printing.PrintTaskSourceRequestedArgs {
  
  /** Gets the DateTime object that indicates the deadline for a print task source request. */
  /* CompleteClass */
  var deadline: Date = js.native
  
  /**
    * Gets a PrintTaskSourceRequestedDeferral object that provides access to a Complete method. This method indicates then the deferral is over.
    * @return Provides access to a Complete method.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Graphics.Printing.PrintTaskSourceRequestedDeferral = js.native
  
  /**
    * Informs the print task of the content to be printed.
    * @param source A pointer to the IPrintDocumentSource interface.
    */
  /* CompleteClass */
  override def setSource(source: IPrintDocumentSource): Unit = js.native
}
