package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActivatedDeferral extends StObject {
  
  def complete(): Unit
}
object IActivatedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IActivatedDeferral]
  }
  
  @scala.inline
  implicit class IActivatedDeferralMutableBuilder[Self <: IActivatedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
