package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selected extends StObject {
  
  def selected(): Boolean
}
object Selected {
  
  inline def apply(selected: () => Boolean): Selected = {
    val __obj = js.Dynamic.literal(selected = js.Any.fromFunction0(selected))
    __obj.asInstanceOf[Selected]
  }
  
  extension [Self <: Selected](x: Self) {
    
    inline def setSelected(value: () => Boolean): Self = StObject.set(x, "selected", js.Any.fromFunction0(value))
  }
}
