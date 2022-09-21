package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  def action(nodeId: String): Unit | js.Promise[Unit]
  
  var icon: String
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object Icon {
  
  inline def apply(action: String => Unit | js.Promise[Unit], icon: String): Icon = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setAction(value: String => Unit | js.Promise[Unit]): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
