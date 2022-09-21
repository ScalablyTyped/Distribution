package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  def action(): Unit | js.Promise[Unit]
  
  var icon: String
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object Action {
  
  inline def apply(action: () => Unit | js.Promise[Unit], icon: String): Action = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
