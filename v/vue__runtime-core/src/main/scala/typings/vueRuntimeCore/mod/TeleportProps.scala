package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeleportProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var to: js.UndefOr[String | RendererElement | Null] = js.undefined
}
object TeleportProps {
  
  inline def apply(): TeleportProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeleportProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeleportProps] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setTo(value: String | RendererElement): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
