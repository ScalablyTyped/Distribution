package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a texture used in the 3D model. */
trait Printing3DModelTexture extends StObject {
  
  /** Gets or sets the texture resource used by the texture. */
  var textureResource: Printing3DTextureResource
  
  /** Get or sets a value that indicates how tiling should occur in the U axis in order to fill the overall requested area. */
  var tileStyleU: Printing3DTextureEdgeBehavior
  
  /** Gets or sets a value that indicates how tiling should occur in the V axis in order to fill the overall requested area. */
  var tileStyleV: Printing3DTextureEdgeBehavior
}
object Printing3DModelTexture {
  
  inline def apply(
    textureResource: Printing3DTextureResource,
    tileStyleU: Printing3DTextureEdgeBehavior,
    tileStyleV: Printing3DTextureEdgeBehavior
  ): Printing3DModelTexture = {
    val __obj = js.Dynamic.literal(textureResource = textureResource.asInstanceOf[js.Any], tileStyleU = tileStyleU.asInstanceOf[js.Any], tileStyleV = tileStyleV.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DModelTexture]
  }
  
  extension [Self <: Printing3DModelTexture](x: Self) {
    
    inline def setTextureResource(value: Printing3DTextureResource): Self = StObject.set(x, "textureResource", value.asInstanceOf[js.Any])
    
    inline def setTileStyleU(value: Printing3DTextureEdgeBehavior): Self = StObject.set(x, "tileStyleU", value.asInstanceOf[js.Any])
    
    inline def setTileStyleV(value: Printing3DTextureEdgeBehavior): Self = StObject.set(x, "tileStyleV", value.asInstanceOf[js.Any])
  }
}
