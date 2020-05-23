package typings.winrtUwp.global.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a texture used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DModelTexture")
@js.native
/** Creates an instance of the Printing3DModelTexture class. */
class Printing3DModelTexture ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture {
  /** Gets or sets the texture resource used by the texture. */
  /* CompleteClass */
  override var textureResource: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource = js.native
  /** Get or sets a value that indicates how tiling should occur in the U axis in order to fill the overall requested area. */
  /* CompleteClass */
  override var tileStyleU: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior = js.native
  /** Gets or sets a value that indicates how tiling should occur in the V axis in order to fill the overall requested area. */
  /* CompleteClass */
  override var tileStyleV: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior = js.native
}

