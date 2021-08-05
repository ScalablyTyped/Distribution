package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the format of an image stream. */
trait ImageEncodingProperties extends StObject {
  
  /** Gets or sets the image height. */
  var height: Double
  
  /** Gets additional format properties for the image stream. */
  var properties: MediaPropertySet
  
  /** Gets or sets the subtype of the format. */
  var subtype: String
  
  /** Gets the format type. */
  var `type`: String
  
  /** Gets or sets the image width. */
  var width: Double
}
object ImageEncodingProperties {
  
  inline def apply(height: Double, properties: MediaPropertySet, subtype: String, `type`: String, width: Double): ImageEncodingProperties = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEncodingProperties]
  }
  
  extension [Self <: ImageEncodingProperties](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: MediaPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
