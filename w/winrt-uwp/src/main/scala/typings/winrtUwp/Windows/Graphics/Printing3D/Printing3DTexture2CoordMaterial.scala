package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 2D texture material used in the 3D model. */
trait Printing3DTexture2CoordMaterial extends StObject {
  
  /** Gets or sets the texture used in the 2D texture material. */
  var texture: Printing3DModelTexture
  
  /** Gets or sets the U-coordinate within the texture, horizontally right from the origin in the upper left of the texture. */
  var u: Double
  
  /** Gets or sets the V-coordinate within the texture, vertically down from the origin in the upper left of the texture. */
  var v: Double
}
object Printing3DTexture2CoordMaterial {
  
  inline def apply(texture: Printing3DModelTexture, u: Double, v: Double): Printing3DTexture2CoordMaterial = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTexture2CoordMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Printing3DTexture2CoordMaterial] (val x: Self) extends AnyVal {
    
    inline def setTexture(value: Printing3DModelTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
