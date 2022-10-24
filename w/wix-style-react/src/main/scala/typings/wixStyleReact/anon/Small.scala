package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Small extends StObject {
  
  def large(param0: `13`): typings.react.mod.global.JSX.Element
  
  def medium(param0: `13`): typings.react.mod.global.JSX.Element
  
  def small(param0: `13`): typings.react.mod.global.JSX.Element
}
object Small {
  
  inline def apply(
    large: `13` => typings.react.mod.global.JSX.Element,
    medium: `13` => typings.react.mod.global.JSX.Element,
    small: `13` => typings.react.mod.global.JSX.Element
  ): Small = {
    val __obj = js.Dynamic.literal(large = js.Any.fromFunction1(large), medium = js.Any.fromFunction1(medium), small = js.Any.fromFunction1(small))
    __obj.asInstanceOf[Small]
  }
  
  extension [Self <: Small](x: Self) {
    
    inline def setLarge(value: `13` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "large", js.Any.fromFunction1(value))
    
    inline def setMedium(value: `13` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "medium", js.Any.fromFunction1(value))
    
    inline def setSmall(value: `13` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "small", js.Any.fromFunction1(value))
  }
}
