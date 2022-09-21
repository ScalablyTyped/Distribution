package typings.videoReact.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlBarControlProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Double] = js.undefined
  
  var player: js.UndefOr[js.Function1[/* props */ PlayerProps, Element]] = js.undefined
}
object ControlBarControlProps {
  
  inline def apply(): ControlBarControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlBarControlProps]
  }
  
  extension [Self <: ControlBarControlProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPlayer(value: /* props */ PlayerProps => Element): Self = StObject.set(x, "player", js.Any.fromFunction1(value))
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
