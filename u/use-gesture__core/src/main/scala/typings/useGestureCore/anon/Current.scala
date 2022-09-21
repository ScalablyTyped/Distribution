package typings.useGestureCore.anon

import typings.std.HTMLElement
import typings.useGestureCore.configMod._DragBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current
  extends StObject
     with _DragBounds {
  
  var current: HTMLElement | Null
}
object Current {
  
  inline def apply(): Current = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[Current]
  }
  
  extension [Self <: Current](x: Self) {
    
    inline def setCurrent(value: HTMLElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
