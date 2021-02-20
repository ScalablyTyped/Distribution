package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebUIActivationStatics extends StObject {
  
  var onactivated: js.Any = js.native
  
  var onnavigated: js.Any = js.native
  
  var onresuming: js.Any = js.native
  
  var onsuspending: js.Any = js.native
}
object IWebUIActivationStatics {
  
  @scala.inline
  def apply(onactivated: js.Any, onnavigated: js.Any, onresuming: js.Any, onsuspending: js.Any): IWebUIActivationStatics = {
    val __obj = js.Dynamic.literal(onactivated = onactivated.asInstanceOf[js.Any], onnavigated = onnavigated.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIActivationStatics]
  }
  
  @scala.inline
  implicit class IWebUIActivationStaticsMutableBuilder[Self <: IWebUIActivationStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnactivated(value: js.Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnnavigated(value: js.Any): Self = StObject.set(x, "onnavigated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresuming(value: js.Any): Self = StObject.set(x, "onresuming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsuspending(value: js.Any): Self = StObject.set(x, "onsuspending", value.asInstanceOf[js.Any])
  }
}
