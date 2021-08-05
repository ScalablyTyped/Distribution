package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the event arguments for the PrintTask.Progressing event. This event is raised during the submitting phase of the PrintTask . */
trait PrintTaskProgressingEventArgs extends StObject {
  
  /** Gets the page count for a print task. */
  var documentPageCount: Double
}
object PrintTaskProgressingEventArgs {
  
  inline def apply(documentPageCount: Double): PrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskProgressingEventArgs]
  }
  
  extension [Self <: PrintTaskProgressingEventArgs](x: Self) {
    
    inline def setDocumentPageCount(value: Double): Self = StObject.set(x, "documentPageCount", value.asInstanceOf[js.Any])
  }
}
