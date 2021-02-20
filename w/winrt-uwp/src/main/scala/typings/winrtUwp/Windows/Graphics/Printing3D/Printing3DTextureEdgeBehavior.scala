package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Printing3DTextureEdgeBehavior extends StObject
/** Specifies how tiling should occur in the U and V axis in order to fill the overall requested area of a texture. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior")
@js.native
object Printing3DTextureEdgeBehavior extends StObject {
  
  /** Clamps texture coordinates to the [0.0, 1.0] range. That is, it applies the texture once, then smears the color of edge pixels. For example, suppose that your application creates a square primitive and assigns texture coordinates of (0.0,0.0), (0.0,3.0), (3.0,3.0), and (3.0,0.0) to the primitive's vertices. Setting the Clamp texture edge behavior results in the texture being applied once. The pixel colors at the top of the columns and the end of the rows are extended to the top and right of the primitive respectively, as shown here. */
  @js.native
  sealed trait clamp extends Printing3DTextureEdgeBehavior
  
  /** Tiles mirror the texture at every integer boundary. For example, with texture coordinates of (0.0,0.0), (0.0,3.0), (3.0,3.0), and (3.0,0.0). Setting the Wrap texture edge behavior results in the texture being applied three times in both the u- and v-directions. Every other row and column that it is applied is a mirror image of the preceding row or column, as shown here. */
  @js.native
  sealed trait mirror extends Printing3DTextureEdgeBehavior
  
  /** No tiling will occur. */
  @js.native
  sealed trait none extends Printing3DTextureEdgeBehavior
  
  /** Tiles repeat the texture resource at every integer junction. For example, with texture coordinates of (0.0,0.0), (0.0,3.0), (3.0,3.0), and (3.0,0.0), setting the Wrap texture edge behavior results in the texture being applied three times in both the u-and v-directions, as shown here. */
  @js.native
  sealed trait wrap extends Printing3DTextureEdgeBehavior
}
