package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometries extends StObject {
  
  var geometries: js.Any = js.native
  
  var images: js.Any = js.native
  
  var materials: js.Any = js.native
  
  var textures: js.Any = js.native
}
object Geometries {
  
  @scala.inline
  def apply(geometries: js.Any, images: js.Any, materials: js.Any, textures: js.Any): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometries]
  }
  
  @scala.inline
  implicit class GeometriesMutableBuilder[Self <: Geometries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometries(value: js.Any): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterials(value: js.Any): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextures(value: js.Any): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
  }
}
