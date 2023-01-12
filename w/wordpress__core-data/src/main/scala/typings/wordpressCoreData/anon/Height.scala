package typings.wordpressCoreData.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var file: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var image_meta: js.UndefOr[Aperture] = js.undefined
  
  var sizes: Record[String, File]
  
  var width: js.UndefOr[Double] = js.undefined
}
object Height {
  
  inline def apply(sizes: Record[String, File]): Height = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImage_meta(value: Aperture): Self = StObject.set(x, "image_meta", value.asInstanceOf[js.Any])
    
    inline def setImage_metaUndefined: Self = StObject.set(x, "image_meta", js.undefined)
    
    inline def setSizes(value: Record[String, File]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
