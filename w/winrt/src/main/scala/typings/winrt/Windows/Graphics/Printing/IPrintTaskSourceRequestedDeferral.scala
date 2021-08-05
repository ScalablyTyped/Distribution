package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskSourceRequestedDeferral extends StObject {
  
  def complete(): Unit
}
object IPrintTaskSourceRequestedDeferral {
  
  inline def apply(complete: () => Unit): IPrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPrintTaskSourceRequestedDeferral]
  }
  
  extension [Self <: IPrintTaskSourceRequestedDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
