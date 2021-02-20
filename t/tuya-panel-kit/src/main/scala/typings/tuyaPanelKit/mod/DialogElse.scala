package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogElse extends ModalProps {
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSName("onShow")
  var onShow_DialogElse: js.UndefOr[js.Function0[Unit]] = js.native
}
object DialogElse {
  
  @scala.inline
  def apply(): DialogElse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogElse]
  }
  
  @scala.inline
  implicit class DialogElseMutableBuilder[Self <: DialogElse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}
