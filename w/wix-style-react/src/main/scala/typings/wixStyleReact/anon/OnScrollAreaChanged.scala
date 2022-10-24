package typings.wixStyleReact.anon

import typings.react.mod.Validator
import typings.std.HTMLElement
import typings.wixStyleReact.distTypesCommonScrollableContainerMod.ScrollAreaData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnScrollAreaChanged extends StObject {
  
  var onScrollAreaChanged: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* scrollChangedData */ ScrollAreaData, Unit]) | Null]]
  ] = js.undefined
  
  var onScrollChanged: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* target */ HTMLElement, Unit]) | Null]]] = js.undefined
}
object OnScrollAreaChanged {
  
  inline def apply(): OnScrollAreaChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnScrollAreaChanged]
  }
  
  extension [Self <: OnScrollAreaChanged](x: Self) {
    
    inline def setOnScrollAreaChanged(value: Validator[js.UndefOr[(js.Function1[/* scrollChangedData */ ScrollAreaData, Unit]) | Null]]): Self = StObject.set(x, "onScrollAreaChanged", value.asInstanceOf[js.Any])
    
    inline def setOnScrollAreaChangedUndefined: Self = StObject.set(x, "onScrollAreaChanged", js.undefined)
    
    inline def setOnScrollChanged(value: Validator[js.UndefOr[(js.Function1[/* target */ HTMLElement, Unit]) | Null]]): Self = StObject.set(x, "onScrollChanged", value.asInstanceOf[js.Any])
    
    inline def setOnScrollChangedUndefined: Self = StObject.set(x, "onScrollChanged", js.undefined)
  }
}
