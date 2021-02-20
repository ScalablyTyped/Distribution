package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskSourceRequestedDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object IPrintTaskSourceRequestedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IPrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPrintTaskSourceRequestedDeferral]
  }
  
  @scala.inline
  implicit class IPrintTaskSourceRequestedDeferralMutableBuilder[Self <: IPrintTaskSourceRequestedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
