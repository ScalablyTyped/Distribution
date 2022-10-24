package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var hovered: Any
  
  var selected: Any
}
object Dictx {
  
  inline def apply(hovered: Any, selected: Any): Dictx = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  extension [Self <: Dictx](x: Self) {
    
    inline def setHovered(value: Any): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
