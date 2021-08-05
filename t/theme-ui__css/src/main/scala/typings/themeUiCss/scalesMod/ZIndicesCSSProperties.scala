package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndicesCSSProperties extends StObject {
  
  var zIndex: js.UndefOr[ZIndices] = js.undefined
}
object ZIndicesCSSProperties {
  
  inline def apply(): ZIndicesCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndicesCSSProperties]
  }
  
  extension [Self <: ZIndicesCSSProperties](x: Self) {
    
    inline def setZIndex(value: ZIndices): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
