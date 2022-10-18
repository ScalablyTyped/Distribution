package typings.svelteLeafletjs.anon

import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIcon extends StObject {
  
  var getIcon: js.UndefOr[js.Function0[Icon_[IconOptions]]] = js.undefined
  
  var options: js.UndefOr[IconOptions] = js.undefined
}
object GetIcon {
  
  inline def apply(): GetIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIcon]
  }
  
  extension [Self <: GetIcon](x: Self) {
    
    inline def setGetIcon(value: () => Icon_[IconOptions]): Self = StObject.set(x, "getIcon", js.Any.fromFunction0(value))
    
    inline def setGetIconUndefined: Self = StObject.set(x, "getIcon", js.undefined)
    
    inline def setOptions(value: IconOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
