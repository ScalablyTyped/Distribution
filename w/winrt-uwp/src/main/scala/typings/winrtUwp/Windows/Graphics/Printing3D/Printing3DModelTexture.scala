package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a texture used in the 3D model. */
@js.native
trait Printing3DModelTexture extends StObject {
  
  /** Gets or sets the texture resource used by the texture. */
  var textureResource: Printing3DTextureResource = js.native
  
  /** Get or sets a value that indicates how tiling should occur in the U axis in order to fill the overall requested area. */
  var tileStyleU: Printing3DTextureEdgeBehavior = js.native
  
  /** Gets or sets a value that indicates how tiling should occur in the V axis in order to fill the overall requested area. */
  var tileStyleV: Printing3DTextureEdgeBehavior = js.native
}
object Printing3DModelTexture {
  
  @scala.inline
  def apply(
    textureResource: Printing3DTextureResource,
    tileStyleU: Printing3DTextureEdgeBehavior,
    tileStyleV: Printing3DTextureEdgeBehavior
  ): Printing3DModelTexture = {
    val __obj = js.Dynamic.literal(textureResource = textureResource.asInstanceOf[js.Any], tileStyleU = tileStyleU.asInstanceOf[js.Any], tileStyleV = tileStyleV.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DModelTexture]
  }
  
  @scala.inline
  implicit class Printing3DModelTextureMutableBuilder[Self <: Printing3DModelTexture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextureResource(value: Printing3DTextureResource): Self = StObject.set(x, "textureResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileStyleU(value: Printing3DTextureEdgeBehavior): Self = StObject.set(x, "tileStyleU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileStyleV(value: Printing3DTextureEdgeBehavior): Self = StObject.set(x, "tileStyleV", value.asInstanceOf[js.Any])
  }
}
