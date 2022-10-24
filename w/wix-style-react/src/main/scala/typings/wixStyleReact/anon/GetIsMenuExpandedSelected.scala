package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIsMenuExpandedSelected extends StObject {
  
  def getIsMenuExpanded(): Boolean
  
  def selected(): Boolean
}
object GetIsMenuExpandedSelected {
  
  inline def apply(getIsMenuExpanded: () => Boolean, selected: () => Boolean): GetIsMenuExpandedSelected = {
    val __obj = js.Dynamic.literal(getIsMenuExpanded = js.Any.fromFunction0(getIsMenuExpanded), selected = js.Any.fromFunction0(selected))
    __obj.asInstanceOf[GetIsMenuExpandedSelected]
  }
  
  extension [Self <: GetIsMenuExpandedSelected](x: Self) {
    
    inline def setGetIsMenuExpanded(value: () => Boolean): Self = StObject.set(x, "getIsMenuExpanded", js.Any.fromFunction0(value))
    
    inline def setSelected(value: () => Boolean): Self = StObject.set(x, "selected", js.Any.fromFunction0(value))
  }
}
