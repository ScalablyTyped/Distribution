package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowsCSSProperties extends StObject {
  
  var boxShadow: js.UndefOr[Shadows] = js.undefined
  
  var textShadow: js.UndefOr[Shadows] = js.undefined
}
object ShadowsCSSProperties {
  
  inline def apply(): ShadowsCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowsCSSProperties]
  }
  
  extension [Self <: ShadowsCSSProperties](x: Self) {
    
    inline def setBoxShadow(value: Shadows): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    inline def setTextShadow(value: Shadows): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
  }
}
