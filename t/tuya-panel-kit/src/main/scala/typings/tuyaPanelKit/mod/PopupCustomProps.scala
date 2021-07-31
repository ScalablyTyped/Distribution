package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupCustomProps
  extends StObject
     with PopupProps {
  
  var content: ReactNode
}
object PopupCustomProps {
  
  @scala.inline
  def apply(): PopupCustomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupCustomProps]
  }
  
  @scala.inline
  implicit class PopupCustomPropsMutableBuilder[Self <: PopupCustomProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
