package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightsCSSProperties extends StObject {
  
  var fontWeight: js.UndefOr[FontWeights] = js.undefined
}
object FontWeightsCSSProperties {
  
  @scala.inline
  def apply(): FontWeightsCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightsCSSProperties]
  }
  
  @scala.inline
  implicit class FontWeightsCSSPropertiesMutableBuilder[Self <: FontWeightsCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontWeight(value: FontWeights): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
  }
}
