package typings.winrtDashUwp.Windows.Graphics.Printing

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Arguments associated with the PrintTaskSourceRequestedHandler delegate. Provides a method for handing the content to be printed to the Print Task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
abstract class PrintTaskSourceRequestedArgs () extends js.Object {
  /** Gets the DateTime object that indicates the deadline for a print task source request. */
  var deadline: Date = js.native
  /**
    * Gets a PrintTaskSourceRequestedDeferral object that provides access to a Complete method. This method indicates then the deferral is over.
    * @return Provides access to a Complete method.
    */
  def getDeferral(): PrintTaskSourceRequestedDeferral = js.native
  /**
    * Informs the print task of the content to be printed.
    * @param source A pointer to the IPrintDocumentSource interface.
    */
  def setSource(source: IPrintDocumentSource): Unit = js.native
}

