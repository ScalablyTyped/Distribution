package typings.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskOptionChangedEventArgs extends StObject {
  
  var optionId: Any
}
object IPrintTaskOptionChangedEventArgs {
  
  inline def apply(optionId: Any): IPrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionChangedEventArgs]
  }
  
  extension [Self <: IPrintTaskOptionChangedEventArgs](x: Self) {
    
    inline def setOptionId(value: Any): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
  }
}
