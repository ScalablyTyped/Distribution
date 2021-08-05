package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskRequestedDeferral extends StObject {
  
  def complete(): Unit
}
object IPrintTaskRequestedDeferral {
  
  inline def apply(complete: () => Unit): IPrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPrintTaskRequestedDeferral]
  }
  
  extension [Self <: IPrintTaskRequestedDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
