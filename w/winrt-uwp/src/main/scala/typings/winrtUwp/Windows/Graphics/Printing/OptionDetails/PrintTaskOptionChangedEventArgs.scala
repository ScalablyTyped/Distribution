package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Called when a print task option has changed. */
trait PrintTaskOptionChangedEventArgs extends StObject {
  
  /** Gets the ID of the print task option that changed. */
  var optionId: js.Any
}
object PrintTaskOptionChangedEventArgs {
  
  inline def apply(optionId: js.Any): PrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionChangedEventArgs]
  }
  
  extension [Self <: PrintTaskOptionChangedEventArgs](x: Self) {
    
    inline def setOptionId(value: js.Any): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
  }
}
