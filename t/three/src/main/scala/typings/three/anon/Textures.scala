package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Textures extends StObject {
  
  var geometries: Double = js.native
  
  var textures: Double = js.native
}
object Textures {
  
  @scala.inline
  def apply(geometries: Double, textures: Double): Textures = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textures]
  }
  
  @scala.inline
  implicit class TexturesMutableBuilder[Self <: Textures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometries(value: Double): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextures(value: Double): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
  }
}
