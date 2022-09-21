package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullScreenToggleProps
  extends StObject
     with ControlBarControlProps {
  
  var actions: Any
}
object FullScreenToggleProps {
  
  inline def apply(actions: Any): FullScreenToggleProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreenToggleProps]
  }
  
  extension [Self <: FullScreenToggleProps](x: Self) {
    
    inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
  }
}
