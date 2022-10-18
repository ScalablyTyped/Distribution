package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FontSetting. */
trait FontSetting extends StObject {
  
  /** When `true`, the font is matched if it is bold. */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /** When `true`, the font is matched if it is italic. */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /** The HTML heading level that any content with the matching font will be converted to. */
  var level: js.UndefOr[Double] = js.undefined
  
  /** The maximum size of the font to match. */
  var max_size: js.UndefOr[Double] = js.undefined
  
  /** The minimum size of the font to match. */
  var min_size: js.UndefOr[Double] = js.undefined
  
  /** The name of the font. */
  var name: js.UndefOr[String] = js.undefined
}
object FontSetting {
  
  inline def apply(): FontSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSetting]
  }
  
  extension [Self <: FontSetting](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMax_size(value: Double): Self = StObject.set(x, "max_size", value.asInstanceOf[js.Any])
    
    inline def setMax_sizeUndefined: Self = StObject.set(x, "max_size", js.undefined)
    
    inline def setMin_size(value: Double): Self = StObject.set(x, "min_size", value.asInstanceOf[js.Any])
    
    inline def setMin_sizeUndefined: Self = StObject.set(x, "min_size", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
