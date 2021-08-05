package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebUINavigatedDeferral extends StObject {
  
  def complete(): Unit
}
object IWebUINavigatedDeferral {
  
  inline def apply(complete: () => Unit): IWebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IWebUINavigatedDeferral]
  }
  
  extension [Self <: IWebUINavigatedDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
