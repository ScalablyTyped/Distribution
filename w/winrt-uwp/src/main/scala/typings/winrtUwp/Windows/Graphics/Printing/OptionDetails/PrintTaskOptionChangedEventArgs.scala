package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Called when a print task option has changed. */
trait PrintTaskOptionChangedEventArgs extends StObject {
  
  /** Gets the ID of the print task option that changed. */
  var optionId: Any
}
object PrintTaskOptionChangedEventArgs {
  
  inline def apply(optionId: Any): PrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintTaskOptionChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setOptionId(value: Any): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
  }
}
