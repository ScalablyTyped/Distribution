package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowsCSSProperties extends StObject {
  
  var boxShadow: js.UndefOr[Shadows] = js.undefined
  
  var textShadow: js.UndefOr[Shadows] = js.undefined
}
object ShadowsCSSProperties {
  
  @scala.inline
  def apply(): ShadowsCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowsCSSProperties]
  }
  
  @scala.inline
  implicit class ShadowsCSSPropertiesMutableBuilder[Self <: ShadowsCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxShadow(value: Shadows): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    @scala.inline
    def setTextShadow(value: Shadows): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
  }
}
