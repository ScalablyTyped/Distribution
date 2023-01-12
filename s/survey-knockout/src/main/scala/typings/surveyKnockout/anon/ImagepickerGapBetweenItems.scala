package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagepickerGapBetweenItems extends StObject {
  
  var imagepickerGapBetweenItems: String
  
  var mobileWidth: String
  
  var themeMark: String
}
object ImagepickerGapBetweenItems {
  
  inline def apply(imagepickerGapBetweenItems: String, mobileWidth: String, themeMark: String): ImagepickerGapBetweenItems = {
    val __obj = js.Dynamic.literal(imagepickerGapBetweenItems = imagepickerGapBetweenItems.asInstanceOf[js.Any], mobileWidth = mobileWidth.asInstanceOf[js.Any], themeMark = themeMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagepickerGapBetweenItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagepickerGapBetweenItems] (val x: Self) extends AnyVal {
    
    inline def setImagepickerGapBetweenItems(value: String): Self = StObject.set(x, "imagepickerGapBetweenItems", value.asInstanceOf[js.Any])
    
    inline def setMobileWidth(value: String): Self = StObject.set(x, "mobileWidth", value.asInstanceOf[js.Any])
    
    inline def setThemeMark(value: String): Self = StObject.set(x, "themeMark", value.asInstanceOf[js.Any])
  }
}
