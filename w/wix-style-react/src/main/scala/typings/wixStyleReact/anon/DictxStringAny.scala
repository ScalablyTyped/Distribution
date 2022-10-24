package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictxStringAny
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object DictxStringAny {
  
  inline def apply(): DictxStringAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictxStringAny]
  }
  
  extension [Self <: DictxStringAny](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
