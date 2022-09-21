package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskSourceRequestedArgs extends StObject {
  
  var deadline: js.Date
  
  def getDeferral(): PrintTaskSourceRequestedDeferral
  
  def setSource(source: IPrintDocumentSource): Unit
}
object IPrintTaskSourceRequestedArgs {
  
  inline def apply(
    deadline: js.Date,
    getDeferral: () => PrintTaskSourceRequestedDeferral,
    setSource: IPrintDocumentSource => Unit
  ): IPrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPrintTaskSourceRequestedArgs]
  }
  
  extension [Self <: IPrintTaskSourceRequestedArgs](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => PrintTaskSourceRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setSetSource(value: IPrintDocumentSource => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
