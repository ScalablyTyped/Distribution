package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskCompletedEventArgs extends StObject {
  
  var completion: PrintTaskCompletion
}
object IPrintTaskCompletedEventArgs {
  
  inline def apply(completion: PrintTaskCompletion): IPrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskCompletedEventArgs]
  }
  
  extension [Self <: IPrintTaskCompletedEventArgs](x: Self) {
    
    inline def setCompletion(value: PrintTaskCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
  }
}
