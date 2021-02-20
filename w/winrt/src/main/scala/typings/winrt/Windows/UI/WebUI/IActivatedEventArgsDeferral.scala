package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActivatedEventArgsDeferral extends StObject {
  
  var activatedOperation: ActivatedOperation = js.native
}
object IActivatedEventArgsDeferral {
  
  @scala.inline
  def apply(activatedOperation: ActivatedOperation): IActivatedEventArgsDeferral = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivatedEventArgsDeferral]
  }
  
  @scala.inline
  implicit class IActivatedEventArgsDeferralMutableBuilder[Self <: IActivatedEventArgsDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
  }
}
