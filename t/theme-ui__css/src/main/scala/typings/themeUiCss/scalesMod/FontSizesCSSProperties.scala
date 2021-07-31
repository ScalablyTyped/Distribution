package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizesCSSProperties extends StObject {
  
  var fontSize: js.UndefOr[FontSizes] = js.undefined
}
object FontSizesCSSProperties {
  
  @scala.inline
  def apply(): FontSizesCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizesCSSProperties]
  }
  
  @scala.inline
  implicit class FontSizesCSSPropertiesMutableBuilder[Self <: FontSizesCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: FontSizes): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
  }
}
