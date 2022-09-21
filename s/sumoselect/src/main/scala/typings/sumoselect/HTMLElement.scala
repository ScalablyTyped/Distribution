package typings.sumoselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElement extends StObject {
  
  var sumo: Methods
}
object HTMLElement {
  
  inline def apply(sumo: Methods): HTMLElement = {
    val __obj = js.Dynamic.literal(sumo = sumo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  
  extension [Self <: HTMLElement](x: Self) {
    
    inline def setSumo(value: Methods): Self = StObject.set(x, "sumo", value.asInstanceOf[js.Any])
  }
}
