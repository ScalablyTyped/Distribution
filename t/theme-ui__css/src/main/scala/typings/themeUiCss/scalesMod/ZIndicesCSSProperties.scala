package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndicesCSSProperties extends StObject {
  
  var zIndex: js.UndefOr[ZIndices] = js.undefined
}
object ZIndicesCSSProperties {
  
  @scala.inline
  def apply(): ZIndicesCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndicesCSSProperties]
  }
  
  @scala.inline
  implicit class ZIndicesCSSPropertiesMutableBuilder[Self <: ZIndicesCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZIndex(value: ZIndices): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
