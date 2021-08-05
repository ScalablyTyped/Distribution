package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of 2D texture materials used in the 3D model. */
trait Printing3DTexture2CoordMaterialGroup extends StObject {
  
  /** Gets the identifier (ID) of the 2D texture material group. */
  var materialGroupId: Double
  
  /** Gets or sets the texture of the material group. */
  var texture: Printing3DModelTexture
  
  /** Gets a group of 2D texture materials used in the 3D model. */
  var texture2Coords: IVector[Printing3DTexture2CoordMaterial]
}
object Printing3DTexture2CoordMaterialGroup {
  
  inline def apply(
    materialGroupId: Double,
    texture: Printing3DModelTexture,
    texture2Coords: IVector[Printing3DTexture2CoordMaterial]
  ): Printing3DTexture2CoordMaterialGroup = {
    val __obj = js.Dynamic.literal(materialGroupId = materialGroupId.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], texture2Coords = texture2Coords.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTexture2CoordMaterialGroup]
  }
  
  extension [Self <: Printing3DTexture2CoordMaterialGroup](x: Self) {
    
    inline def setMaterialGroupId(value: Double): Self = StObject.set(x, "materialGroupId", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Printing3DModelTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTexture2Coords(value: IVector[Printing3DTexture2CoordMaterial]): Self = StObject.set(x, "texture2Coords", value.asInstanceOf[js.Any])
  }
}
