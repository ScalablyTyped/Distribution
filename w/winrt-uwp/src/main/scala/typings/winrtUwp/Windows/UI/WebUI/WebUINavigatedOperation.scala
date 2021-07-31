package typings.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app navigation operation. */
trait WebUINavigatedOperation extends StObject {
  
  /**
    * Requests that the completion of app navigation be delayed.
    * @return The navigated deferral object.
    */
  def getDeferral(): WebUINavigatedDeferral
}
object WebUINavigatedOperation {
  
  @scala.inline
  def apply(getDeferral: () => WebUINavigatedDeferral): WebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[WebUINavigatedOperation]
  }
  
  @scala.inline
  implicit class WebUINavigatedOperationMutableBuilder[Self <: WebUINavigatedOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => WebUINavigatedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
