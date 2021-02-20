package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebUINavigatedDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object IWebUINavigatedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IWebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IWebUINavigatedDeferral]
  }
  
  @scala.inline
  implicit class IWebUINavigatedDeferralMutableBuilder[Self <: IWebUINavigatedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
