package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogElse
  extends StObject
     with ModalProps {
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("onShow")
  var onShow_DialogElse: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DialogElse {
  
  inline def apply(): DialogElse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogElse]
  }
  
  extension [Self <: DialogElse](x: Self) {
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}
