package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometries extends StObject {
  
  var geometries: Any
  
  var images: Any
  
  var materials: Any
  
  var textures: Any
}
object Geometries {
  
  inline def apply(geometries: Any, images: Any, materials: Any, textures: Any): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geometries] (val x: Self) extends AnyVal {
    
    inline def setGeometries(value: Any): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setImages(value: Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setMaterials(value: Any): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setTextures(value: Any): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
  }
}
