package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebUINavigatedOperation extends StObject {
  
  def getDeferral(): WebUINavigatedDeferral = js.native
}
object IWebUINavigatedOperation {
  
  @scala.inline
  def apply(getDeferral: () => WebUINavigatedDeferral): IWebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IWebUINavigatedOperation]
  }
  
  @scala.inline
  implicit class IWebUINavigatedOperationMutableBuilder[Self <: IWebUINavigatedOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => WebUINavigatedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
