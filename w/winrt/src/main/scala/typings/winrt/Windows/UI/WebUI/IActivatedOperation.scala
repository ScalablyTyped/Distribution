package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActivatedOperation extends StObject {
  
  def getDeferral(): ActivatedDeferral
}
object IActivatedOperation {
  
  inline def apply(getDeferral: () => ActivatedDeferral): IActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IActivatedOperation]
  }
  
  extension [Self <: IActivatedOperation](x: Self) {
    
    inline def setGetDeferral(value: () => ActivatedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
