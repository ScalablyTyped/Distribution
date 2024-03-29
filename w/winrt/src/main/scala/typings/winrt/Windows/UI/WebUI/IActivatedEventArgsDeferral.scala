package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActivatedEventArgsDeferral extends StObject {
  
  var activatedOperation: ActivatedOperation
}
object IActivatedEventArgsDeferral {
  
  inline def apply(activatedOperation: ActivatedOperation): IActivatedEventArgsDeferral = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivatedEventArgsDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IActivatedEventArgsDeferral] (val x: Self) extends AnyVal {
    
    inline def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
  }
}
