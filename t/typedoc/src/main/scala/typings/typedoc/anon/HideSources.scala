package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideSources extends StObject {
  
  var hideSources: js.UndefOr[Boolean] = js.undefined
}
object HideSources {
  
  inline def apply(): HideSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideSources]
  }
  
  extension [Self <: HideSources](x: Self) {
    
    inline def setHideSources(value: Boolean): Self = StObject.set(x, "hideSources", value.asInstanceOf[js.Any])
    
    inline def setHideSourcesUndefined: Self = StObject.set(x, "hideSources", js.undefined)
  }
}
