package typings.winrtUwp.global.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 2D texture material used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial")
@js.native
/** Creates an instance of the Printing3DTexture2CoordMaterial class. */
class Printing3DTexture2CoordMaterial ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial {
  /** Gets or sets the texture used in the 2D texture material. */
  /* CompleteClass */
  override var texture: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture = js.native
  /** Gets or sets the U-coordinate within the texture, horizontally right from the origin in the upper left of the texture. */
  /* CompleteClass */
  override var u: Double = js.native
  /** Gets or sets the V-coordinate within the texture, vertically down from the origin in the upper left of the texture. */
  /* CompleteClass */
  override var v: Double = js.native
}

