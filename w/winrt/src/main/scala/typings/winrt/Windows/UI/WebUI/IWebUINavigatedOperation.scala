package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebUINavigatedOperation extends StObject {
  
  def getDeferral(): WebUINavigatedDeferral
}
object IWebUINavigatedOperation {
  
  inline def apply(getDeferral: () => WebUINavigatedDeferral): IWebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IWebUINavigatedOperation]
  }
  
  extension [Self <: IWebUINavigatedOperation](x: Self) {
    
    inline def setGetDeferral(value: () => WebUINavigatedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
