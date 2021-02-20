package typings.winrt.Windows.Graphics.Printing

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskSourceRequestedArgs extends StObject {
  
  var deadline: Date = js.native
  
  def getDeferral(): PrintTaskSourceRequestedDeferral = js.native
  
  def setSource(source: IPrintDocumentSource): Unit = js.native
}
object IPrintTaskSourceRequestedArgs {
  
  @scala.inline
  def apply(
    deadline: Date,
    getDeferral: () => PrintTaskSourceRequestedDeferral,
    setSource: IPrintDocumentSource => Unit
  ): IPrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPrintTaskSourceRequestedArgs]
  }
  
  @scala.inline
  implicit class IPrintTaskSourceRequestedArgsMutableBuilder[Self <: IPrintTaskSourceRequestedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => PrintTaskSourceRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSource(value: IPrintDocumentSource => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
