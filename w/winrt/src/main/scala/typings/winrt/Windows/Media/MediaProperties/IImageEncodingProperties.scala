package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImageEncodingProperties
  extends StObject
     with IMediaEncodingProperties {
  
  var height: Double
  
  var width: Double
}
object IImageEncodingProperties {
  
  @scala.inline
  def apply(height: Double, properties: MediaPropertySet, subtype: String, `type`: String, width: Double): IImageEncodingProperties = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageEncodingProperties]
  }
  
  @scala.inline
  implicit class IImageEncodingPropertiesMutableBuilder[Self <: IImageEncodingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
