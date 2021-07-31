package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WordHeadingDetection. */
trait WordHeadingDetection extends StObject {
  
  var fonts: js.UndefOr[js.Array[FontSetting]] = js.undefined
  
  var styles: js.UndefOr[js.Array[WordStyle]] = js.undefined
}
object WordHeadingDetection {
  
  @scala.inline
  def apply(): WordHeadingDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordHeadingDetection]
  }
  
  @scala.inline
  implicit class WordHeadingDetectionMutableBuilder[Self <: WordHeadingDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFonts(value: js.Array[FontSetting]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    @scala.inline
    def setFontsVarargs(value: FontSetting*): Self = StObject.set(x, "fonts", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[WordStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: WordStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
